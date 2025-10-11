package org.example.strategyPattern;

import org.example.strategyPattern.flyBeh.FlyWithWings;
import org.example.strategyPattern.quackBeh.Quack;
import org.example.strategyPattern.quackBeh.Squeak;

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
