package org.example.patterns.factoryPattern.step3_add_ingredients;

import org.example.patterns.factoryPattern.step3_add_ingredients.pizzas.Pizza;
import org.example.factoryPattern.step3_add_ingredients.stores.*;
import org.example.patterns.factoryPattern.step3_add_ingredients.stores.ChicagoPizzaStore;
import org.example.patterns.factoryPattern.step3_add_ingredients.stores.NYPizzaStore;
import org.example.patterns.factoryPattern.step3_add_ingredients.stores.PizzaStore;

public class TestDrivePizza {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza + "\n");
    }
}
