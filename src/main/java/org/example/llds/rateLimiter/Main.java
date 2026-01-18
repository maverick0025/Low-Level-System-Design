package org.example.llds.rateLimiter;

import org.example.llds.rateLimiter.enums.UserTier;
import org.example.llds.rateLimiter.model.User;
import org.example.llds.rateLimiter.service.RateLimiterService;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        RateLimiterService rateLimiterService = new RateLimiterService();
        User freeUser = new User("user1", UserTier.FREE);
        User premiumUser = new User("user2", UserTier.PREMIUM);

        System.out.println("=== Free User Requests ===");
        for (int i = 1; i <= 20; i++) {
            boolean allowed = rateLimiterService.allowRequest(freeUser);
            System.out.println("Request " + i + " for Free User: " + (allowed ? "ALLOWED" : "BLOCKED"));
            Thread.sleep(100); // simulate delay between requests
        }

//        System.out.println("\n=== Premium User Requests ===");
//        for (int i = 1; i <= 120; i++) {
//            boolean allowed = rateLimiterService.allowRequest(premiumUser);
//            System.out.println("Request " + i + " for Premium User: " + (allowed ? "ALLOWED" : "BLOCKED"));
//            Thread.sleep(100);
//        }
    }
}
