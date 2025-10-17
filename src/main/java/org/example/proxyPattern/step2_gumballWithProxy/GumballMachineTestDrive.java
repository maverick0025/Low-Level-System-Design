package org.example.proxyPattern.step2_gumballWithProxy;

import java.rmi.Naming;
import java.rmi.RemoteException;

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

        try{
            GumballMachine gumballMachine = new GumballMachine(location, count);
            Naming.rebind("//"+location+"/gumballmachine", gumballMachine);
        }catch (Exception ex){
            ex.printStackTrace();
            ex.getMessage();
            System.out.println("Exception occured either while initializing a gumball machine or while adding it to rmi registry");
        }

    }
}
