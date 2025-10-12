package org.example.decoratorPattern.step2_addSizes.condiments;

import org.example.decoratorPattern.step2_addSizes.Beverage;
import org.example.decoratorPattern.step2_addSizes.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {

        double cost = beverage.cost();
        if (beverage.getSize() == Sizes.TALL) {
            cost += .20;
        } else if (beverage.getSize() == Sizes.GRANDE) {
            cost += .25;
        } else if (beverage.getSize() == Sizes.VENTI) {
            cost += .30;
        }
        return cost;
    }

}
