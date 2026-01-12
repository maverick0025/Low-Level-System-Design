package org.example.patterns.compoundPattern.step6_observer.interfaces;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
