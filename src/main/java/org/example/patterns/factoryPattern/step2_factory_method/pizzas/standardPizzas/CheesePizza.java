package org.example.patterns.factoryPattern.step2_factory_method.pizzas.standardPizzas;

import org.example.patterns.factoryPattern.step2_factory_method.Pizza;

public class CheesePizza extends Pizza {
	public CheesePizza() {
		name = "Cheese Pizza";
		dough = "Regular Crust";
		sauce = "Marinara Pizza Sauce";
		toppings.add("Fresh Mozzarella");
		toppings.add("Parmesan");
	}
}
