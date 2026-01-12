package org.example.patterns.factoryPattern.step2_factory_method.pizzas.NewYorkPizzas;

import org.example.patterns.factoryPattern.step2_factory_method.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style sauce and cheese pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara sauce";
        toppings.add("Grated Reggiano Cheese");
    }

}
