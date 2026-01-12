package org.example.patterns.strategyPattern;

import org.example.patterns.strategyPattern.flyBeh.FlyWithWings;
import org.example.patterns.strategyPattern.quackBeh.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I look like malla reddy so they named me Mallard duck!");
    }



}
