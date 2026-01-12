package org.example.patterns.statePattern.step2;

public class GumballMachine {
    int count = 0;
    State state;

    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State soldOutState;

    public GumballMachine(int gumBalls) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState =new SoldOutState(this);

        this.count = gumBalls;
        if(gumBalls > 0){
            state = noQuarterState;
        }else{
            state = soldOutState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }
    public void ejectQuarter(){
        state.ejectQuarter();
    }
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    void releaseBall(){
        System.out.println("Drumroll please! your gumball is coming out...");
        if(count > 0){
            count = count - 1;
        }
    }

    int getCount(){
        return count;
    }

    void refill(int count){
        this.count += count;
        System.out.println("Gumball machine was just refilled!");
        state.refill();
    }
    void setState(State state) {
        this.state = state;
    }
    public State getState() {
        return state;
    }
    public State getSoldOutState() {
        return soldOutState;
    }
    public State getNoQuarterState() {
        return noQuarterState;
    }
    public State getHasQuarterState() {
        return hasQuarterState;
    }
    public State getSoldState() {
        return soldState;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n Mighty gumball corp.");
        sb.append("\n Model 6720");
        sb.append("\n Inventory: "+ count + " gumball");
        if(count != 1){
            sb.append("s");
        }
        sb.append("\n Machine is "+ this.state + "\n");
        return sb.toString();
    }
}
