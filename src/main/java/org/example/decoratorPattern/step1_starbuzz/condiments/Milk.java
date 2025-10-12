package org.example.decoratorPattern.step1_starbuzz.condiments;

import org.example.decoratorPattern.step1_starbuzz.Beverage;
import org.example.decoratorPattern.step1_starbuzz.CondimentDecorator;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

}
