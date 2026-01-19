package org.example.llds.rateLimiter.limiter;

import org.example.llds.rateLimiter.enums.RateLimitType;
import org.example.llds.rateLimiter.model.RateLimitConfig;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class FixedWindowRateLimiter extends RateLimiter{

    public FixedWindowRateLimiter(RateLimitConfig config) {
        super(RateLimitType.FIXED_WINDOW, config);
    }

    //userid->numberofrequests in currentwindow
    private Map<String, Integer> requestCount = new ConcurrentHashMap<>();
    //userid->current window
    private Map<String, Long> windowStart = new HashMap<>();

    @Override
    public boolean allowRequest(String userId) {

        AtomicBoolean allowed = new AtomicBoolean();
        long currentReqWindow = (System.currentTimeMillis()/100)/ config.getWindowInSeconds();

        requestCount.compute(userId, (id, count)->{
            long lastReqWindow = windowStart.getOrDefault(id, currentReqWindow);

            if(lastReqWindow != currentReqWindow){
                windowStart.put(id, currentReqWindow);
                allowed.set(true);
                return 1; //only 1 request that too, the current one.
            }
            if(count == null) count = 0;
            if(count < config.getMaxRequests()){
                allowed.set(true);
                count++;
            }
            return count;
        });

        return allowed.get();
    }
}
