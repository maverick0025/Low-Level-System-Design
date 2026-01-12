package org.example.patterns.decoratorPattern.step1_starbuzz;

public abstract class Beverage {

    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
