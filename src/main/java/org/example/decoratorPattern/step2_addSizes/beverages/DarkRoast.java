package org.example.decoratorPattern.step2_addSizes.beverages;

import org.example.decoratorPattern.step2_addSizes.Beverage;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

