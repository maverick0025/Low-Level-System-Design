package org.example.patterns.compoundPattern.step1_ducks;

public class DecoyDuck implements Quackable{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
