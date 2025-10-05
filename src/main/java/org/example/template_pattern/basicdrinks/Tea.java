package org.example.template_pattern.basicdrinks;

public class Tea implements Drink{

    @Override
    public void prepRecipie() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void steepTeaBag(){
        System.out.println("Steeping the tea");
    }

    private void addLemon(){
        System.out.println("Adding Lemon");
    }
}
