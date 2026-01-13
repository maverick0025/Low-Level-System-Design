package org.example.patterns.factoryPattern.step3_add_ingredients.ingredients.factory;

import org.example.patterns.factoryPattern.step3_add_ingredients.ingredients.ingredientTypes.*;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
