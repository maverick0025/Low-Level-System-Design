package org.example.patterns.decoratorPattern.step1_starbuzz;

import org.example.decoratorPattern.step1_starbuzz.beverages.*;
import org.example.decoratorPattern.step1_starbuzz.condiments.*;
import org.example.patterns.decoratorPattern.step1_starbuzz.beverages.DarkRoast;
import org.example.patterns.decoratorPattern.step1_starbuzz.beverages.Espresso;
import org.example.patterns.decoratorPattern.step1_starbuzz.beverages.HouseBlend;
import org.example.patterns.decoratorPattern.step1_starbuzz.condiments.Mocha;
import org.example.patterns.decoratorPattern.step1_starbuzz.condiments.Soy;
import org.example.patterns.decoratorPattern.step1_starbuzz.condiments.Whip;

import java.text.DecimalFormat;

public class TestCoffeeShop {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.##");
        // order: Plain Espresso without condiments
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + df.format(beverage.cost()));

        //order: darkroast double mocha with whip cream
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        //here the Beverage class is being extended by CondimentDecorator which is then an extension to Whip class
        // so, return type can be Beverage or Whip or CondimentDecorator
        System.out.println(beverage2.getDescription() + " $"+ df.format(beverage2.cost()));

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + df.format(beverage3.cost()));

    }
}
