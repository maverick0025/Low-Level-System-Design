package org.example.patterns.decoratorPattern.step1_starbuzz.condiments;

import org.example.patterns.decoratorPattern.step1_starbuzz.Beverage;
import org.example.patterns.decoratorPattern.step1_starbuzz.CondimentDecorator;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}
