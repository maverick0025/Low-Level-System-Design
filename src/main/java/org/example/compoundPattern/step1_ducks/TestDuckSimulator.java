package org.example.compoundPattern.step1_ducks;

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

        System.out.println("\n -- Duck Simulator --");

        testDuckSimulator.simulate(redheadDuck);
        testDuckSimulator.simulate(rubberDuck);
        testDuckSimulator.simulate(mallardDuck);
        testDuckSimulator.simulate(duckCall);
        testDuckSimulator.simulate(decoyDuck);
    }

    void simulate(Quackable duck){
        duck.quack();
    }



}
