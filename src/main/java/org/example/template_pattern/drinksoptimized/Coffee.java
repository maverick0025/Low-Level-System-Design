package org.example.template_pattern.drinksoptimized;

public class Coffee extends CaffeineBeverate{
    @Override
    void brewCoffeeOrTea() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
