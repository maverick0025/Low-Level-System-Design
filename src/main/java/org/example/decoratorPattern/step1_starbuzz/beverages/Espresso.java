package org.example.decoratorPattern.step1_starbuzz.beverages;

import org.example.decoratorPattern.step1_starbuzz.Beverage;

public class Espresso extends Beverage {
  
	public Espresso() {
		description = "Espresso";
	}
  
	public double cost() {
		return 1.99;
	}
}

