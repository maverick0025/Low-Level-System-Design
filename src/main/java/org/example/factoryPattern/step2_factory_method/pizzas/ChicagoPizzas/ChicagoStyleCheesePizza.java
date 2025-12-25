package org.example.factoryPattern.step2_factory_method.pizzas.ChicagoPizzas;

import org.example.factoryPattern.step2_factory_method.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }


    @Override
    protected void cut() {
        System.out.println("cutting "+ this.getName() + "square cuts");
    }
}
