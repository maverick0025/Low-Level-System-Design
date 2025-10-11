package org.example.statePattern.step3_sameasstep2_butavoidingduplicatecode;

public abstract class State {

    public void insertQuarter() {
        System.out.println("You have to insert a quarter. If you have already, turn the crank");
    }

    public void ejectQuarter(){
        System.out.println("You can eject if you have already inserted the quarter and hadn't turned the crank yet!");
    }
    public void turnCrank(){
        System.out.println("You must insert a quarter first!");
    }
    public void dispense(){
        System.out.println("Your gumball will be dispensed once you insert a quarter and turn the crank!");
    }
    public void refill(){
        throw new UnsupportedOperationException("refill can only be done by an executive");
    }
}
