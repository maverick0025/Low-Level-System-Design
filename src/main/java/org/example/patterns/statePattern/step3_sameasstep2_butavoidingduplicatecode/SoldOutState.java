package org.example.patterns.statePattern.step3_sameasstep2_butavoidingduplicatecode;

public class SoldOutState extends State {
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
    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public String toString() {
        return "All sold out! Please contact a representative!";
    }
}


