package org.example.llds.rateLimiter.service;

import org.example.llds.rateLimiter.enums.RateLimitType;
import org.example.llds.rateLimiter.enums.UserTier;
import org.example.llds.rateLimiter.factory.RateLimiterFactory;
import org.example.llds.rateLimiter.limiter.RateLimiter;
import org.example.llds.rateLimiter.model.RateLimitConfig;
import org.example.llds.rateLimiter.model.User;

import java.util.*;

public class RateLimiterService {
    private final Map<UserTier, RateLimiter> rateLimiters = new HashMap<>();

    public RateLimiterService() {
        rateLimiters.put(
                UserTier.FREE,
                RateLimiterFactory.createRateLimiter(
                        RateLimitType.TOKEN_BUCKET,
                        new RateLimitConfig(10, 60) //10 req/min
                )
        );

        rateLimiters.put(
                UserTier.PREMIUM,
                RateLimiterFactory.createRateLimiter(
                        RateLimitType.FIXED_WINDOW,
                        new RateLimitConfig(100, 60) //100 req/min
                )
        );
    }

    public boolean allowRequest(User user){
        RateLimiter rateLimiter = rateLimiters.get(user.getTier());
        if(rateLimiter == null) {
            throw new IllegalArgumentException("No limiter configured for tier: "+ user.getTier());
        }
        return rateLimiter.allowRequest(user.getUserId());
    }
}
