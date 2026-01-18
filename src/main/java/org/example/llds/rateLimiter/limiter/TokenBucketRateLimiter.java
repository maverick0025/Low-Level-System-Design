package org.example.llds.rateLimiter.limiter;

import org.example.llds.rateLimiter.enums.RateLimitType;
import org.example.llds.rateLimiter.model.RateLimitConfig;

public class TokenBucketRateLimiter extends RateLimiter{

    public TokenBucketRateLimiter(RateLimitConfig config) {
        super(RateLimitType.TOKEN_BUCKET, config);
    }

    @Override
    public boolean allowRequest(String userId) {
        return false;
    }
}
