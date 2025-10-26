package org.example.compoundPattern.step7_observer_flock.adapter;

import org.example.compoundPattern.step7_observer_flock.Observable;
import org.example.compoundPattern.step7_observer_flock.interfaces.Honkable;
import org.example.compoundPattern.step7_observer_flock.interfaces.Observer;
import org.example.compoundPattern.step7_observer_flock.interfaces.Quackable;

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
        notifyObservers();
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
