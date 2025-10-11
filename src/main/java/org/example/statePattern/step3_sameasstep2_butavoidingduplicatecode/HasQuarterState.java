package org.example.statePattern.step3_sameasstep2_butavoidingduplicatecode;

public class HasQuarterState extends State {

    GumballMachine gumballMachine;
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
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
    public String toString() {
        return "Waiting for you to turn the crank!";
    }
}
