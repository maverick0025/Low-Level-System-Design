package org.example.patterns.factoryPattern.step2_factory_method;

import org.example.factoryPattern.step2_factory_method.pizzas.ChicagoPizzas.*;
import org.example.patterns.factoryPattern.step2_factory_method.pizzas.ChicagoPizzas.ChicagoStyleCheesePizza;
import org.example.patterns.factoryPattern.step2_factory_method.pizzas.ChicagoPizzas.ChicagoStyleClamPizza;
import org.example.patterns.factoryPattern.step2_factory_method.pizzas.ChicagoPizzas.ChicagoStylePepperoniPizza;
import org.example.patterns.factoryPattern.step2_factory_method.pizzas.ChicagoPizzas.ChicagoStyleVeggiePizza;

public class PizzaStoreChicago extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new ChicagoStyleCheesePizza();
                break;
            case "clam":
                pizza = new ChicagoStyleClamPizza();
                break;
            case "pepperoni":
                pizza = new ChicagoStylePepperoniPizza();
                break;
            case "veggie":
                pizza = new ChicagoStyleVeggiePizza();
                break;
        }
        return pizza;
    }

}
