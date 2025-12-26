package org.example.factoryPattern.step2_factory_method;

import org.example.factoryPattern.step2_factory_method.pizzas.NewYorkPizzas.NYStyleCheesePizza;
import org.example.factoryPattern.step2_factory_method.pizzas.NewYorkPizzas.NYStyleClamPizza;
import org.example.factoryPattern.step2_factory_method.pizzas.NewYorkPizzas.NYStylePepperoniPizza;
import org.example.factoryPattern.step2_factory_method.pizzas.NewYorkPizzas.NYStyleVeggiePizza;

import java.util.HashMap;

public class PizzaStoreNY extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new NYStyleCheesePizza();
                break;
            case "clam":
                pizza = new NYStyleClamPizza();
                break;
            case "pepperoni":
                pizza = new NYStylePepperoniPizza();
                break;
            case "veggie":
                pizza = new NYStyleVeggiePizza();
                break;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        return pizza;
    }
}