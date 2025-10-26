package org.example.compoundPattern.step4_factory.factory;

import org.example.compoundPattern.step4_factory.interfaces.Quackable;

public abstract class AbstractDuckFactory {

    public abstract Quackable createDecoyDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createRubberDuck();

}
