package org.example.patterns.decoratorPattern.step2_addSizes.condiments;

import org.example.patterns.decoratorPattern.step2_addSizes.Beverage;
import org.example.patterns.decoratorPattern.step2_addSizes.CondimentDecorator;

public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {

		double cost = beverage.cost();
		if (beverage.getSize() == Sizes.TALL) {
			cost += .50;
		} else if (beverage.getSize() == Sizes.GRANDE) {
			cost += .65;
		} else if (beverage.getSize() == Sizes.VENTI) {
			cost += .80;
		}
		return cost;
	}}
