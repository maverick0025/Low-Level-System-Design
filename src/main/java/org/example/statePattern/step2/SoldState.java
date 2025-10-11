package org.example.statePattern.step2;

public class SoldState implements State{
    GumballMachine gumballMachine;
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    @Override
    public void insertQuarter() {
        System.out.println("Wait, I'm giving you a gumball already!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No take backsies. You already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice won't get you a new gumball! haha!");
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
