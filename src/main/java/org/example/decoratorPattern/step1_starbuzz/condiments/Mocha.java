package org.example.decoratorPattern.step1_starbuzz.condiments;

import org.example.decoratorPattern.step1_starbuzz.Beverage;
import org.example.decoratorPattern.step1_starbuzz.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 1.2 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
