package org.example.decoratorPattern.step1_starbuzz.beverages;

import org.example.decoratorPattern.step1_starbuzz.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() { description = "House Blend"; }

    @Override
    public double cost() { return 1.99; }

}
