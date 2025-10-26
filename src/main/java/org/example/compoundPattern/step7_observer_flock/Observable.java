package org.example.compoundPattern.step7_observer_flock;

import org.example.compoundPattern.step7_observer_flock.interfaces.Observer;
import org.example.compoundPattern.step7_observer_flock.interfaces.QuackObservable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements QuackObservable {
    List<Observer> observerList = new ArrayList<Observer>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observerList.iterator();
        while(iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(duck);

        }
    }

    @Override
    public String toString() {
        return "Observers list: " + observerList;
    }
}
