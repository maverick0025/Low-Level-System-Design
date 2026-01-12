package org.example.patterns.templatePattern.basicdrinks;

public class Coffee implements Drink{
    @Override
    public void prepRecipie() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAnMilk();
    }

    private void brewCoffeeGrinds(){
        System.out.println("Dripping Coffee through filter");
    }
    private void addSugarAnMilk(){
        System.out.println("Adding Sugar and Milk");
    }
}
