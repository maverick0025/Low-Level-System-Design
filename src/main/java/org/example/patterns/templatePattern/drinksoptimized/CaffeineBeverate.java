package org.example.patterns.templatePattern.drinksoptimized;

public abstract class CaffeineBeverate {

    final void prepareRecipie(){
        boilingWater();
        brewCoffeeOrTea();
        pourInCup();
        addCondiments();
        callCustomer();
    }

    abstract void brewCoffeeOrTea();
    abstract void addCondiments(); // subclasses must override
    void callCustomer() {} //this is optional for subclasses to override.

    void boilingWater(){
        System.out.println("boiling water");
    }

    void pourInCup(){
        System.out.println("pour in cup");
    }
}
