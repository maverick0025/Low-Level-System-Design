package org.example.decoratorPattern.step2_addSizes;

import org.example.decoratorPattern.step2_addSizes.beverages.DarkRoast;
import org.example.decoratorPattern.step2_addSizes.beverages.Espresso;
import org.example.decoratorPattern.step2_addSizes.beverages.HouseBlend;
import org.example.decoratorPattern.step2_addSizes.condiments.Mocha;
import org.example.decoratorPattern.step2_addSizes.condiments.Soy;
import org.example.decoratorPattern.step2_addSizes.condiments.Whip;

import java.text.DecimalFormat;

public class TestCoffeeShop {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.##");
        // order: Plain Espresso without condiments
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + df.format(beverage.cost()));

        //order: darkroast double mocha with whip cream
        Beverage beverage2 = new DarkRoast();
        beverage2.setSize(Beverage.Sizes.VENTI);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + ", size: "+ beverage2.getSize() + "; $"+ df.format(beverage2.cost()));

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Sizes.GRANDE);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()+
                ", size: "+ beverage3.getSize()
                        + " $" + df.format(beverage3.cost()));

    }
}
