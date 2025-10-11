package org.example.strategyPattern;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
    }

    @Override
    void display() {
        System.out.println("I'm just a Decoy");
    }
}
