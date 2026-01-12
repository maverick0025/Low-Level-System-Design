package org.example.patterns.statePattern.step2;

public class SoldOutState implements  State{
    GumballMachine gumballMachine;
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("We are out of stock! you can't insert!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("We are out of stock!");
    }

    @Override
    public void turnCrank() {
        System.out.println("We are out of stock!");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public String toString() {
        return "All sold out! Please contact a representative!";
    }
}


