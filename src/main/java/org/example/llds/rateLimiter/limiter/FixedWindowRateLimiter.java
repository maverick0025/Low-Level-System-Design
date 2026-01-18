package org.example.llds.rateLimiter.limiter;

import org.example.llds.rateLimiter.enums.RateLimitType;
import org.example.llds.rateLimiter.model.RateLimitConfig;

public class FixedWindowRateLimiter extends RateLimiter{

    public FixedWindowRateLimiter(RateLimitConfig config) {
        super(RateLimitType.FIXED_WINDOW, config);
    }

    @Override
    public boolean allowRequest(String userId) {
        return false;
    }
}
