package org.example.compoundPattern.step7_observer_flock.interfaces;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
