package org.example.factoryPattern.step2_factory_method;

import org.example.factoryPattern.step2_factory_method.pizzas.ChicagoPizzas.*;
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
