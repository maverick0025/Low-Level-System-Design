package org.example.patterns.factoryPattern.step2_factory_method.pizzas.ChicagoPizzas;
import org.example.patterns.factoryPattern.step2_factory_method.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza() {
		name = "Chicago Deep Dish Veggie Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
	}
 
	@Override
	protected void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
