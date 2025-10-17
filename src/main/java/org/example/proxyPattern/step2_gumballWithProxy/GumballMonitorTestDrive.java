package org.example.proxyPattern.step2_gumballWithProxy;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMonitorTestDrive {

    public static void main(String[] args) {
        GumballMachineRemote stub = null;

        try{
            stub = (GumballMachineRemote) Naming.lookup("rmi://localhost/gumballmachine");
        }catch (Exception ex){
            System.out.println("Caught exception in RMs key lookup");
        }

        GumballMonitor ceoMonitor = new GumballMonitor(stub);

        ceoMonitor.report();

    }
}
