package org.example.proxyPattern.step1_gumballmonitor;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        int count=0;
        String location="California";
        if (args.length <2){
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try{
            count = Integer.parseInt(args[1]);
        }catch(Exception ex){
            ex.printStackTrace();
            System.exit(1);
        }
        location = args[0];

        GumballMachine gumballMachine = new GumballMachine(location, count);
        GumballMonitor monitor = new GumballMonitor(gumballMachine);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        monitor.report();
    }
}
