package org.example.llds.rateLimiter.limiter;

import org.example.llds.rateLimiter.enums.RateLimitType;
import org.example.llds.rateLimiter.model.RateLimitConfig;

public class SlidingWindowLogRateLimiter extends RateLimiter{

    public SlidingWindowLogRateLimiter(RateLimitConfig config) {
        super(RateLimitType.SLIDING_WINDOW_LOG, config);
    }

    @Override
    public boolean allowRequest(String userId) {
        return false;
    }
}
