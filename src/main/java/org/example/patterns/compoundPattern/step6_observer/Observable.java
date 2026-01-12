package org.example.patterns.compoundPattern.step6_observer;

import org.example.patterns.compoundPattern.step6_observer.interfaces.Observer;
import org.example.patterns.compoundPattern.step6_observer.interfaces.QuackObservable;

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
}
