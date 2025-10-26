package org.example.compoundPattern.step7_observer_flock.factory;

import org.example.compoundPattern.step7_observer_flock.interfaces.Quackable;

public abstract class AbstractDuckFactory {

    public abstract Quackable createDecoyDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createRubberDuck();
    public abstract Quackable createGoose();

}
