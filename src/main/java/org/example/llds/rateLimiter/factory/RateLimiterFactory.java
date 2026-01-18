package org.example.llds.rateLimiter.factory;

import org.example.llds.rateLimiter.enums.RateLimitType;
import org.example.llds.rateLimiter.limiter.FixedWindowRateLimiter;
import org.example.llds.rateLimiter.limiter.RateLimiter;
import org.example.llds.rateLimiter.limiter.SlidingWindowLogRateLimiter;
import org.example.llds.rateLimiter.limiter.TokenBucketRateLimiter;
import org.example.llds.rateLimiter.model.RateLimitConfig;

public class RateLimiterFactory {

    public static RateLimiter createRateLimiter(RateLimitType type, RateLimitConfig config){

        return switch (type){
            case FIXED_WINDOW -> new FixedWindowRateLimiter(config);
            case TOKEN_BUCKET -> new TokenBucketRateLimiter(config);
            case SLIDING_WINDOW_LOG -> new SlidingWindowLogRateLimiter(config);
            default -> throw new IllegalArgumentException("Unknown rate limiter algorithm: " + type);
        };
    }
}
