package org.example.patterns.strategyPattern;

import org.example.patterns.strategyPattern.flyBeh.FlyBehavior;
import org.example.patterns.strategyPattern.quackBeh.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    //Below method is common for every class that extends Duck. Can't override
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    //display will be overridden by all Duck extensions
    abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    //both the 2 methods below don't need to be overridden they are readily available for all extensions and is set via the set functions above
    public void performFly(){flyBehavior.fly();}
    public void performQuack(){quackBehavior.quack();}

}
