package org.example.patterns.factoryPattern.step1_simplefactory;

public class TestSimplePizzaFactory {
    public static void main(String[] args) {

        SimplePizzaFactory pizzafac = new SimplePizzaFactory();
        String type = "cheese";
        PizzaStore store = new PizzaStore(pizzafac);
        store.orderPizza(type);

        type = "clam";
        store.orderPizza(type);
    }
}
