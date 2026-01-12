package org.example.patterns.factoryPattern.step2_factory_method.pizzas.standardPizzas;

import org.example.patterns.factoryPattern.step2_factory_method.Pizza;

public class PepperoniPizza extends Pizza {
	public PepperoniPizza() {
		name = "Pepperoni Pizza";
		dough = "Crust";
		sauce = "Marinara sauce";
		toppings.add("Sliced Pepperoni");
		toppings.add("Sliced Onion");
		toppings.add("Grated parmesan cheese");
	}
}
