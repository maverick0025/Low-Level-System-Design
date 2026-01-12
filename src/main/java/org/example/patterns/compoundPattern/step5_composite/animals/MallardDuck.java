package org.example.patterns.compoundPattern.step5_composite.animals;

import org.example.patterns.compoundPattern.step5_composite.interfaces.Quackable;

public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
