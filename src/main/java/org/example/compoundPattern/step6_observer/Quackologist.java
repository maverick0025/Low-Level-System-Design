package org.example.compoundPattern.step6_observer;

import org.example.compoundPattern.step6_observer.interfaces.Observer;
import org.example.compoundPattern.step6_observer.interfaces.QuackObservable;

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("duck: "+ duck.toString() + " just quacked! ");
    }

    @Override
    public String toString() {
        return "Quackologist";
    }
}
