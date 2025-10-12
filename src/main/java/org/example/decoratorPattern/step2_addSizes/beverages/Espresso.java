package org.example.decoratorPattern.step2_addSizes.beverages;

import org.example.decoratorPattern.step2_addSizes.Beverage;

public class Espresso extends Beverage {
  
	public Espresso() {
		description = "Espresso";
	}
  
	public double cost() {
		return 1.99;
	}
}

