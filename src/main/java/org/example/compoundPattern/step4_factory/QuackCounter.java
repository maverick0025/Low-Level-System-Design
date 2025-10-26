package org.example.compoundPattern.step4_factory;

import org.example.compoundPattern.step4_factory.interfaces.Quackable;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int count = 0;

    public QuackCounter(Quackable duckie) {
        this.duck = duckie;
    }

    public static int getCount(){
        return count;
    }

    @Override
    public void quack() {
        this.duck.quack();
        count++;
    }
}
