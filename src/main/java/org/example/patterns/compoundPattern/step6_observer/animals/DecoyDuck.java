package org.example.patterns.compoundPattern.step6_observer.animals;

import org.example.patterns.compoundPattern.step6_observer.Observable;
import org.example.patterns.compoundPattern.step6_observer.interfaces.Observer;
import org.example.patterns.compoundPattern.step6_observer.interfaces.Quackable;

public class DecoyDuck implements Quackable {

    Observable observable;

    public DecoyDuck() {
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
        return "Decoy Duck";
    }

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
        notifyObservers();
    }
}
