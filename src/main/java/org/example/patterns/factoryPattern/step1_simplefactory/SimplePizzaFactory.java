package org.example.patterns.factoryPattern.step1_simplefactory;

import org.example.patterns.factoryPattern.step1_simplefactory.pizzas.*;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
        }
        return pizza;
    }
}
