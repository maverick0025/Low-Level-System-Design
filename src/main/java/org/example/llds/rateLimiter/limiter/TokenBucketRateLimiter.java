package org.example.llds.rateLimiter.limiter;

import org.example.llds.rateLimiter.enums.RateLimitType;
import org.example.llds.rateLimiter.model.RateLimitConfig;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class TokenBucketRateLimiter extends RateLimiter{
    //userid->no.of tokens (essentially, it's the buckets each bucket id is the user id)
    Map<String, Integer> tokens = new ConcurrentHashMap<>();

    //userid->lastrefilledtime
    Map<String, Long> lastRefillTime = new HashMap<>();
    //(coming request time (now) - last refill time)/refillrate => number of tokens to be added before processing the request

    public TokenBucketRateLimiter(RateLimitConfig config) {
        super(RateLimitType.TOKEN_BUCKET, config);
    }
    //user A and user B request parsing is okay concurrently
    //multiple requests from user A should be synchronized properly. Hence, I use concurrent hashmap.
    @Override
    public boolean allowRequest(String userId) {
        AtomicBoolean allowed = new AtomicBoolean();
        long currentTime = System.currentTimeMillis();

        //need to synchronize the below
//        int currentTokens = refillTokens(userId, currentTime);
//        if(currentTokens>0){
//            allowed.set(true);
//            currentTokens--;
//        }else{
//            allowed.set(false);
//        }
//        tokens.put(userId, currentTokens);

        tokens.compute(userId, (x,y)->{
            int currentTokens = refillTokens(userId, currentTime);
            if(currentTokens>0){
                allowed.set(true);
                currentTokens--;
            }
            return currentTokens;
        });

        return allowed.get();
    }

    private int refillTokens(String userId, long now){
        double refillRate = (double) config.getWindowInSeconds()/ config.getMaxRequests();

        long lastRefillAt = lastRefillTime.getOrDefault(userId, now);

        long elapsedSeconds = (now-lastRefillAt)/1000;
        int refillTokens= (int) (elapsedSeconds/refillRate);

        int currentTokens = tokens.getOrDefault(userId, config.getMaxRequests());
        currentTokens = Math.min(currentTokens+refillTokens , config.getMaxRequests());

        if(refillTokens>0){
            lastRefillTime.put(userId, now);
        }

        return currentTokens;
    }
}
