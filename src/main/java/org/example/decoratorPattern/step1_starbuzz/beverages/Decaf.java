package org.example.decoratorPattern.step1_starbuzz.beverages;

import org.example.decoratorPattern.step1_starbuzz.Beverage;

public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

