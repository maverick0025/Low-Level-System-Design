package org.example.statePattern.step3_sameasstep2_butavoidingduplicatecode;

public class NoQuarterState extends State {

    GumballMachine gumballMachine;
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a Quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public String toString() {
        return "waiting for quarter!";
    }
}
