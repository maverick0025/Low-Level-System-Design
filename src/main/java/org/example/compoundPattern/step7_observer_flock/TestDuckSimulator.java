package org.example.compoundPattern.step7_observer_flock;

import org.example.compoundPattern.step7_observer_flock.factory.AbstractDuckFactory;
import org.example.compoundPattern.step7_observer_flock.factory.DuckFactory;
import org.example.compoundPattern.step7_observer_flock.interfaces.Quackable;

public class TestDuckSimulator {

    public TestDuckSimulator() {
    }

    public static void main(String[] args) {
        TestDuckSimulator testDuckSimulator = new TestDuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactory();

        testDuckSimulator.simulate(duckFactory);
        System.out.println("\n -- Duck Simulator --");
        System.out.println("Total counts : " + QuackCounter.getCount());
    }

    void simulate(AbstractDuckFactory duckFactory) {

        Quackologist observer_quackologist = new Quackologist();

        Flock flockOfDucks = new Flock();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        flockOfDucks.addQuacker(duckFactory.createRedheadDuck());
        flockOfDucks.addQuacker(duckFactory.createDecoyDuck());
        flockOfDucks.addQuacker(duckFactory.createDuckCall());
        flockOfDucks.addQuacker(rubberDuck);
        flockOfDucks.addQuacker(duckFactory.createGoose());

        Flock mallardFlock = new Flock(); //many mallard ducks
        mallardFlock.addQuacker(duckFactory.createMallardDuck());
        mallardFlock.addQuacker(duckFactory.createMallardDuck());
        mallardFlock.addQuacker(duckFactory.createMallardDuck());
        mallardFlock.addQuacker(duckFactory.createMallardDuck());

        flockOfDucks.addQuacker(mallardFlock);

        flockOfDucks.registerObserver(observer_quackologist);

        simulate(flockOfDucks);
        simulate(mallardFlock);

        System.out.println(rubberDuck.toString());
    }

    void simulate(Flock flock){
        flock.quack();
    }
}