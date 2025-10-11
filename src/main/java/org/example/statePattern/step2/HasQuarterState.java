package org.example.statePattern.step2;

public class HasQuarterState implements  State{

    GumballMachine gumballMachine;
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You already inserted a quarter!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned!");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("NO gumball dispensed");
    }

    @Override
    public void refill() {}

    @Override
    public String toString() {
        return "Waiting for you to turn the crank!";
    }
}
