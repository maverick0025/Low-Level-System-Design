package org.example.patterns.compoundPattern.step7_observer_flock.factory;

import org.example.patterns.compoundPattern.step7_observer_flock.QuackCounter;
import org.example.patterns.compoundPattern.step7_observer_flock.adapter.GooseAdapter;
import org.example.patterns.compoundPattern.step7_observer_flock.animals.*;
import org.example.patterns.compoundPattern.step7_observer_flock.interfaces.Quackable;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createDecoyDuck() {
        return new QuackCounter(new DecoyDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public Quackable createGoose(){ return new GooseAdapter(new Goose()); }
}
