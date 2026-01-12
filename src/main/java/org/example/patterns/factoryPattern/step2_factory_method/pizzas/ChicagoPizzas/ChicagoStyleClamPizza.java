package org.example.patterns.factoryPattern.step2_factory_method.pizzas.ChicagoPizzas;
import org.example.patterns.factoryPattern.step2_factory_method.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
	public ChicagoStyleClamPizza() {
		name = "Chicago Style Clam Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Frozen Clams from Chesapeake Bay");
	}

 	@Override
	protected void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
