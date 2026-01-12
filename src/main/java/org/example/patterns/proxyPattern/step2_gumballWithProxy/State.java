package org.example.patterns.proxyPattern.step2_gumballWithProxy;

import java.io.Serializable;

public interface State extends Serializable {
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}
