package org.example.llds.rateLimiter.limiter;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.example.llds.rateLimiter.enums.RateLimitType;
import org.example.llds.rateLimiter.model.RateLimitConfig;

@AllArgsConstructor
public abstract class RateLimiter {

    public RateLimitType type;
    protected RateLimitConfig config;

    public abstract boolean allowRequest(String userId);
}
