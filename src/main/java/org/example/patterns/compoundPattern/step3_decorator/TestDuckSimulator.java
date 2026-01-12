package org.example.patterns.compoundPattern.step3_decorator;

import org.example.patterns.compoundPattern.step3_decorator.interfaces.Quackable;
import org.example.patterns.compoundPattern.step3_decorator.adapter.GooseAdapter;

public class TestDuckSimulator {

    public TestDuckSimulator() {
    }

    public static void main(String[] args) {
        TestDuckSimulator testDuckSimulator = new TestDuckSimulator();

        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable mallardDuck = new QuackCounter( new MallardDuck());
        Quackable duckCall = new QuackCounter( new DuckCall());
        Quackable decoyDuck = new QuackCounter( new DecoyDuck());
        Quackable adaptedGoose = new GooseAdapter(new Goose());
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
