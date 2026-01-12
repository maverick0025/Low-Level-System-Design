package org.example.patterns.strategyPattern;

import org.example.patterns.strategyPattern.flyBeh.FlyNoWay;
import org.example.patterns.strategyPattern.quackBeh.Squeak;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    void display() {
        System.out.println("I'm model model..super model!");
    }
}
