package org.example.decoratorPattern.step2_addSizes.beverages;

import org.example.decoratorPattern.step2_addSizes.Beverage;

public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

