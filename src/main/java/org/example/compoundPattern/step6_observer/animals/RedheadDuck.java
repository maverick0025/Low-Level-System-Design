package org.example.compoundPattern.step6_observer.animals;

import org.example.compoundPattern.step6_observer.Observable;
import org.example.compoundPattern.step6_observer.interfaces.Observer;
import org.example.compoundPattern.step6_observer.interfaces.Quackable;

public class RedheadDuck implements Quackable {

    Observable observable;

    public RedheadDuck() {
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
        return "Redhead Duck";
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }
}
