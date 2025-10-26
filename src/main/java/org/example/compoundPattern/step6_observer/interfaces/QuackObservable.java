package org.example.compoundPattern.step6_observer.interfaces;

import org.example.compoundPattern.step6_observer.interfaces.Observer;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
