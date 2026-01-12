package org.example.patterns.compoundPattern.step3_decorator;

import org.example.patterns.compoundPattern.step3_decorator.interfaces.Quackable;

public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
