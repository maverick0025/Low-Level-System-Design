package org.example.patterns.compoundPattern.step4_factory.animals;

import org.example.patterns.compoundPattern.step4_factory.interfaces.Quackable;

public class RedheadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
