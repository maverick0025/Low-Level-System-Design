package org.example.compoundPattern.step5_composite;

import org.example.compoundPattern.step5_composite.interfaces.Quackable;

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
