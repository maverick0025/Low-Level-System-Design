package org.example.patterns.compoundPattern.step6_observer;

import org.example.patterns.compoundPattern.step6_observer.interfaces.Observer;
import org.example.patterns.compoundPattern.step6_observer.interfaces.Quackable;

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

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }

    @Override
    public String toString() {
        return duck.toString();
    }
}
