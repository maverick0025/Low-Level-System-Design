package org.example.proxyPattern.step2_gumballWithProxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMonitor {

    GumballMachineRemote remoteMachine;
    public GumballMonitor(GumballMachineRemote machine){
        this.remoteMachine = machine;
    }

    public void report(){
        try{
            System.out.println("Gumball Machine: " + remoteMachine.getLocation());
            System.out.println("Current inventory: " + remoteMachine.getCount() + " gumballs");
            System.out.println("Current state: " + remoteMachine.getState());
        }catch(RemoteException ex){
            ex.getMessage();
            System.out.println("Caused a remote exception in GumballMonitor class report method");
        }

    }

}
