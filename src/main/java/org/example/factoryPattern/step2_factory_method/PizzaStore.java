package org.example.factoryPattern.step2_factory_method;

public abstract class PizzaStore {

    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type){
        Pizza pizza = this.createPizza(type);
        System.out.println("---Making a "+ type + " pizza");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
