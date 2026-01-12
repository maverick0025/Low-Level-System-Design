package org.example.patterns.compoundPattern.step7_observer_flock.animals;

import org.example.patterns.compoundPattern.step7_observer_flock.Observable;
import org.example.patterns.compoundPattern.step7_observer_flock.interfaces.Observer;
import org.example.patterns.compoundPattern.step7_observer_flock.interfaces.Quackable;

public class DuckCall implements Quackable {

    Observable observable;

    public DuckCall() {
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
        return "Duck Call";
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }
}
