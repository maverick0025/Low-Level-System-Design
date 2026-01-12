package org.example.patterns.compoundPattern.step6_observer.animals;

import org.example.patterns.compoundPattern.step6_observer.Observable;
import org.example.patterns.compoundPattern.step6_observer.interfaces.Observer;
import org.example.patterns.compoundPattern.step6_observer.interfaces.Quackable;

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
