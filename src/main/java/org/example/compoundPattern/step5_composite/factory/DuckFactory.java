package org.example.compoundPattern.step5_composite.factory;

import org.example.compoundPattern.step5_composite.QuackCounter;
import org.example.compoundPattern.step5_composite.adapter.GooseAdapter;
import org.example.compoundPattern.step5_composite.animals.*;
import org.example.compoundPattern.step5_composite.interfaces.Quackable;

public class DuckFactory extends AbstractDuckFactory {
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
