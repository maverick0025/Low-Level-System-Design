package org.example.templatePattern.basicdrinks;

public interface Drink {

    public void prepRecipie();

    public default void boilWater(){
        System.out.println("Boiling Water");
    }

    public default void pourInCup(){
        System.out.println("Pouring into cup");
    }

}
