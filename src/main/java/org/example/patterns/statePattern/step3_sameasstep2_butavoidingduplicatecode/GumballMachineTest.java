package org.example.patterns.statePattern.step3_sameasstep2_butavoidingduplicatecode;

public class GumballMachineTest {

    public static void main(String[] args) {

        GumballMachine gumballMachine = new GumballMachine(2);

        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();

        gumballMachine.refill(5);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

    }
}
