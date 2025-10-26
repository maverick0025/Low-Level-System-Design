package org.example.compoundPattern.step4_factory;

import org.example.compoundPattern.step4_factory.adapter.GooseAdapter;
import org.example.compoundPattern.step4_factory.factory.DuckFactory;
import org.example.compoundPattern.step4_factory.interfaces.Quackable;

public class TestDuckSimulator {

    public TestDuckSimulator() {
    }

    public static void main(String[] args) {
        TestDuckSimulator testDuckSimulator = new TestDuckSimulator();
        DuckFactory duckFactory = new DuckFactory();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable decoyDuck = duckFactory.createDecoyDuck();

        Quackable adaptedGoose = duckFactory.createGoose();
        System.out.println("\n -- Duck Simulator --");

        testDuckSimulator.simulate(redheadDuck);
        testDuckSimulator.simulate(rubberDuck);
        testDuckSimulator.simulate(mallardDuck);
        testDuckSimulator.simulate(duckCall);
        testDuckSimulator.simulate(decoyDuck);
        testDuckSimulator.simulate(adaptedGoose);

        System.out.println("Total counts : " + QuackCounter.getCount());
    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
