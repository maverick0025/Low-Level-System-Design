package org.example.compoundPattern.step5_composite;

import org.example.compoundPattern.step5_composite.factory.AbstractDuckFactory;
import org.example.compoundPattern.step5_composite.factory.CountingDuckFactory;

public class TestDuckSimulator {

    public TestDuckSimulator() {
    }

    public static void main(String[] args) {
        TestDuckSimulator testDuckSimulator = new TestDuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        testDuckSimulator.simulate(duckFactory);
        System.out.println("\n -- Duck Simulator --");
        System.out.println("Total counts : " + QuackCounter.getCount());
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Flock flockOfDucks = new Flock();

        flockOfDucks.addQuacker(duckFactory.createRedheadDuck());
        flockOfDucks.addQuacker(duckFactory.createDecoyDuck());
        flockOfDucks.addQuacker(duckFactory.createDuckCall());
        flockOfDucks.addQuacker(duckFactory.createRubberDuck());
        flockOfDucks.addQuacker(duckFactory.createMallardDuck());
        flockOfDucks.addQuacker(duckFactory.createGoose());

        Flock mallardFlock = new Flock(); //many mallard ducks
        mallardFlock.addQuacker(duckFactory.createMallardDuck());
        mallardFlock.addQuacker(duckFactory.createMallardDuck());
        mallardFlock.addQuacker(duckFactory.createMallardDuck());
        mallardFlock.addQuacker(duckFactory.createMallardDuck());

        simulate(flockOfDucks);
        simulate(mallardFlock);
    }

    void simulate(Flock flock){
        flock.quack();
    }
}