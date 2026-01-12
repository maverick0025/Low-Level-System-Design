package org.example.patterns.proxyPattern.step2_gumballWithProxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

//This is the skeleton prese that accepts the remote calls and make everything work on the server side.
public interface GumballMachineRemote extends Remote {
	public int getCount() throws RemoteException;
	public String getLocation() throws RemoteException;
	public State getState() throws RemoteException;
}
