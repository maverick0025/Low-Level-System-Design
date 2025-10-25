package org.example.compoundPattern.step2_adapter;

import org.example.compoundPattern.step2_adapter.interfaces.Quackable;
import org.example.compoundPattern.step2_adapter.adapter.GooseAdapter;

public class TestDuckSimulator {

    public TestDuckSimulator() {
    }

    public static void main(String[] args) {
        TestDuckSimulator testDuckSimulator = new TestDuckSimulator();

        Quackable redheadDuck = new RedheadDuck();
        Quackable rubberDuck = new RubberDuck();
        Quackable mallardDuck = new MallardDuck();
        Quackable duckCall = new DuckCall();
        Quackable decoyDuck = new DecoyDuck();
        Quackable adaptedGoose = new GooseAdapter(new Goose());
        System.out.println("\n -- Duck Simulator --");

        testDuckSimulator.simulate(redheadDuck);
        testDuckSimulator.simulate(rubberDuck);
        testDuckSimulator.simulate(mallardDuck);
        testDuckSimulator.simulate(duckCall);
        testDuckSimulator.simulate(decoyDuck);
        testDuckSimulator.simulate(adaptedGoose);
    }

    void simulate(Quackable duck){
        duck.quack();
    }



}
