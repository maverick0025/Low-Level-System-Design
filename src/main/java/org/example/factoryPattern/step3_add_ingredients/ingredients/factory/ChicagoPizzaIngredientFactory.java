package org.example.factoryPattern.step3_add_ingredients.ingredients.factory;

import org.example.factoryPattern.step3_add_ingredients.ingredients.ThickCrustDough;
import org.example.factoryPattern.step3_add_ingredients.ingredients.ingredientTypes.*;
import org.example.factoryPattern.step3_add_ingredients.ingredients.*;

public class ChicagoPizzaIngredientFactory
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), 
		                      new Spinach(), 
		                      new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
