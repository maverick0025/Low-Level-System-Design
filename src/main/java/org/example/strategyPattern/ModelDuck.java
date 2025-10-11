package org.example.strategyPattern;

import org.example.strategyPattern.flyBeh.FlyNoWay;
import org.example.strategyPattern.quackBeh.Squeak;

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
