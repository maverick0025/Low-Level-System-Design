package org.example.llds.rateLimiter.limiter;

import org.example.llds.rateLimiter.enums.RateLimitType;
import org.example.llds.rateLimiter.model.RateLimitConfig;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class SlidingWindowLogRateLimiter extends RateLimiter{

    public SlidingWindowLogRateLimiter(RateLimitConfig config) {
        super(RateLimitType.SLIDING_WINDOW_LOG, config);
    }
    private final Map<String, Queue<Long>> requestLog = new ConcurrentHashMap<>();
    //user id-> request queue only successful requests until now

    @Override
    public boolean allowRequest(String userId) {

        AtomicBoolean allowed = new AtomicBoolean();
        long now = System.currentTimeMillis()/1000; //current time in seconds

        requestLog.compute(userId, (id, log)->{
           if(log == null) log = new ArrayDeque<>();

           while(!log.isEmpty() &&
                   (log.peek()-now >= config.getWindowInSeconds())){
               log.poll();
           }

           if(log.size() < config.getMaxRequests()){
               log.add(now);
               allowed.set(true);
           }
            return log;
        });

        return allowed.get();
    }
}
