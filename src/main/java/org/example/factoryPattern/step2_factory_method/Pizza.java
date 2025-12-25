package org.example.factoryPattern.step2_factory_method;

import java.util.ArrayList;
import java.util.List;

abstract public class Pizza {
    public String name;
    public String sauce;
    public String dough;
    public List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }
    protected void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    protected void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }
    protected void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
