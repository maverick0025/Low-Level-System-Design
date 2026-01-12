package org.example.patterns.compoundPattern.step7_observer_flock;

import org.example.patterns.compoundPattern.step7_observer_flock.interfaces.Observer;
import org.example.patterns.compoundPattern.step7_observer_flock.interfaces.QuackObservable;

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
