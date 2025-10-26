package org.example.compoundPattern.step6_observer.adapter;

import org.example.compoundPattern.step6_observer.Observable;
import org.example.compoundPattern.step6_observer.interfaces.Honkable;
import org.example.compoundPattern.step6_observer.interfaces.Observer;
import org.example.compoundPattern.step6_observer.interfaces.Quackable;

public class GooseAdapter implements Quackable {
    Honkable honkable;
    Observable observable;

    public GooseAdapter(Honkable honkable) {
        this.honkable = honkable;
        this.observable = new Observable(this);
    }

    @Override
    public void quack(){
        honkable.honk();
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
        return "Goose";
    }

}
