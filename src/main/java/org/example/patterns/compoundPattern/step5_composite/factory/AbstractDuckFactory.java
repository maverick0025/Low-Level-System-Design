package org.example.patterns.compoundPattern.step5_composite.factory;

import org.example.patterns.compoundPattern.step5_composite.interfaces.Quackable;

public abstract class AbstractDuckFactory {

    public abstract Quackable createDecoyDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createRubberDuck();
    public abstract Quackable createGoose();

}
