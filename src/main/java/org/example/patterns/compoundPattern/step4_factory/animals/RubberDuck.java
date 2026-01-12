package org.example.patterns.compoundPattern.step4_factory.animals;

import org.example.patterns.compoundPattern.step4_factory.interfaces.Quackable;

public class RubberDuck implements Quackable {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
