package org.example.patterns.compoundPattern.step4_factory.factory;

import org.example.compoundPattern.step4_factory.*;
import org.example.patterns.compoundPattern.step4_factory.QuackCounter;
import org.example.patterns.compoundPattern.step4_factory.adapter.GooseAdapter;
import org.example.compoundPattern.step4_factory.animals.*;
import org.example.patterns.compoundPattern.step4_factory.animals.*;
import org.example.patterns.compoundPattern.step4_factory.interfaces.Quackable;

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

    public Quackable createGoose(){
        return new GooseAdapter(new Goose());
    }
}
