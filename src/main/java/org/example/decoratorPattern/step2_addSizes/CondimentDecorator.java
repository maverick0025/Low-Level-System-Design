package org.example.decoratorPattern.step2_addSizes;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;
    public abstract String getDescription();
    // This Class is an abstract class, so, we don't need to override cost() method from Beverate abstract class. But the cost method must be overidden by any class that extends this condimentDecorator

    public Sizes getSize(){
        return this.beverage.getSize();
    }
}
