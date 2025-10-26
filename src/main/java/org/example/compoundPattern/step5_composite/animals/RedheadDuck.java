package org.example.compoundPattern.step5_composite.animals;

import org.example.compoundPattern.step5_composite.interfaces.Quackable;

public class RedheadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
