package org.example.patterns.observerPattern.step1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubjectMain implements Subject{

    List<Observer> observers;
    int value = 0;

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }

    public ConcreteSubjectMain() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update(value);
        }
    }
}
