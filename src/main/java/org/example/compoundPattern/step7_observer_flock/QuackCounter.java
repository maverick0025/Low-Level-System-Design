package org.example.compoundPattern.step7_observer_flock;

import org.example.compoundPattern.step7_observer_flock.interfaces.Observer;
import org.example.compoundPattern.step7_observer_flock.interfaces.Quackable;

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
        System.out.println("register obs is called in Quack Counter "+ duck.toString());
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("notify obs is called in Quack Counter "+ duck.toString());
        duck.notifyObservers();
    }

    @Override
    public String toString() {
        return duck.toString();
    }
}
