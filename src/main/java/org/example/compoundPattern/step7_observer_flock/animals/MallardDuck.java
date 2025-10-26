package org.example.compoundPattern.step7_observer_flock.animals;

import org.example.compoundPattern.step7_observer_flock.Observable;
import org.example.compoundPattern.step7_observer_flock.interfaces.Observer;
import org.example.compoundPattern.step7_observer_flock.interfaces.Quackable;

public class MallardDuck implements Quackable {

    Observable observable;

    public MallardDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "Mallard Duck";
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }
}
