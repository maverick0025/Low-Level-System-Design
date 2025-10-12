package org.example.decoratorPattern.step1_starbuzz.beverages;

import org.example.decoratorPattern.step1_starbuzz.Beverage;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

