package org.example.compoundPattern.step6_observer;

import org.example.compoundPattern.step6_observer.interfaces.Quackable;
import org.example.compoundPattern.step6_observer.factory.AbstractDuckFactory;
import org.example.compoundPattern.step6_observer.factory.DuckFactory;

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

        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable decoyDuck = duckFactory.createDecoyDuck();

        mallardDuck.registerObserver(observer_quackologist);
        rubberDuck.registerObserver(observer_quackologist);

        System.out.println("Observer added for mallard duckk and rubber duck!");

        simulate(redheadDuck);
        simulate(rubberDuck);
        simulate(mallardDuck);
        simulate(duckCall);
        simulate(decoyDuck);
    }

    void simulate(Quackable duck){
        duck.quack();
    }
}