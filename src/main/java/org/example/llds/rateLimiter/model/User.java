package org.example.llds.rateLimiter.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.llds.rateLimiter.enums.UserTier;

@Getter
@AllArgsConstructor
public class User {

    private String userId;
    private UserTier tier;
}
