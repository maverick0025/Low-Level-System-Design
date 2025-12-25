package org.example.factoryPattern.step2_factory_method.pizzas.NewYorkPizzas;
import org.example.factoryPattern.step2_factory_method.Pizza;

public class NYStyleClamPizza extends Pizza {

	public NYStyleClamPizza() {
		name = "NY Style Clam Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Fresh Clams from Long Island Sound");
	}
}
