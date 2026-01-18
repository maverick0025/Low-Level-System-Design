package org.example.llds.rateLimiter.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RateLimitConfig {
    private int maxRequests;
    private int windowInSeconds;
}
