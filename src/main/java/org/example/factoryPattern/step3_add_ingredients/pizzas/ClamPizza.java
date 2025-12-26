package org.example.factoryPattern.step3_add_ingredients.pizzas;

import org.example.factoryPattern.step3_add_ingredients.ingredients.factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
 
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
	}
}
