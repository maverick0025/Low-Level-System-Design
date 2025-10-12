package org.example.decoratorPattern.step2_addSizes.condiments;

import org.example.decoratorPattern.step2_addSizes.Beverage;
import org.example.decoratorPattern.step2_addSizes.CondimentDecorator;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {

		double cost = beverage.cost();
		if (beverage.getSize() == Sizes.TALL) {
			cost += .10;
		} else if (beverage.getSize() == Sizes.GRANDE) {
			cost += .15;
		} else if (beverage.getSize() == Sizes.VENTI) {
			cost += .20;
		}
		return cost;
	}
}
