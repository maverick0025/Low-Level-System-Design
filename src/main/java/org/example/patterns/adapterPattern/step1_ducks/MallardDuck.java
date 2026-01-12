package org.example.patterns.adapterPattern.step1_ducks;

import org.example.patterns.adapterPattern.step1_ducks.interfaces.Duck;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
