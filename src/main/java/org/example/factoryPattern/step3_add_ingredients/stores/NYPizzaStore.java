package org.example.factoryPattern.step3_add_ingredients.stores;

import org.example.factoryPattern.step3_add_ingredients.ingredients.factory.NYPizzaIngredientFactory;
import org.example.factoryPattern.step3_add_ingredients.ingredients.factory.PizzaIngredientFactory;
import org.example.factoryPattern.step3_add_ingredients.pizzas.*;
import org.example.factoryPattern.step3_add_ingredients.pizzas.Pizza;

public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
			new NYPizzaIngredientFactory();
 
		if (item.equals("cheese")) {
  
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
  
		} else if (item.equals("veggie")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
 
		} else if (item.equals("clam")) {
 
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
 
		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
 
		} 
		return pizza;
	}
}
