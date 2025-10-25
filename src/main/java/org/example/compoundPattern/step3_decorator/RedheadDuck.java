package org.example.compoundPattern.step3_decorator;

import org.example.compoundPattern.step3_decorator.interfaces.Quackable;

public class RedheadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
