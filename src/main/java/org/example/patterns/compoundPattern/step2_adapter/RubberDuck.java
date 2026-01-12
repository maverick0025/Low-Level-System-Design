package org.example.patterns.compoundPattern.step2_adapter;

import org.example.patterns.compoundPattern.step2_adapter.interfaces.Quackable;

public class RubberDuck implements Quackable {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
