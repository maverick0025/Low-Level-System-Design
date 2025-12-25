package org.example.factoryPattern.step2_factory_method.pizzas.standardPizzas;

import org.example.factoryPattern.step2_factory_method.Pizza;

public class ClamPizza extends Pizza {
	public ClamPizza() {
		name = "Clam Pizza";
		dough = "Thin crust";
		sauce = "White garlic sauce";
		toppings.add("Clams");
		toppings.add("Grated parmesan cheese");
	}
}
