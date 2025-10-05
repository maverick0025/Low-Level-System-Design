package org.example.template_pattern.drinksoptimized;

public class Tea extends CaffeineBeverate{

    @Override
    void brewCoffeeOrTea() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }

    void callCustomer(){
        System.out.println("Call the bloody tea's customer");
    }
}
