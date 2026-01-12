package org.example.patterns.statePattern.step3_sameasstep2_butavoidingduplicatecode;

public class SoldState extends State {
    GumballMachine gumballMachine;
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount()> 0 ){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else{
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public String toString() {
        return "Dispensing your gumball!";
    }

    @Override
    public void refill() {

    }
}
