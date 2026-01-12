package org.example.patterns.decoratorPattern.step2_addSizes.beverages;

import org.example.patterns.decoratorPattern.step2_addSizes.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() { description = "House Blend"; }

    @Override
    public double cost() { return 1.99; }

}
