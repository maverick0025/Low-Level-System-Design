package org.example.strategyPattern;

import org.example.strategyPattern.flyBeh.FlyBehavior;
import org.example.strategyPattern.quackBeh.QuackBehavior;

public class TestDucks {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("=================");
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.performFly();

        System.out.println("=================");

        FlyBehavior cannotfly= () -> System.out.println("I can't fly");
        QuackBehavior sqk = () -> System.out.println("Squeakkk");
        RubberDuck rubberDuck = new RubberDuck(cannotfly, sqk);
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        System.out.println("=================");

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        try{
            decoyDuck.performFly();
        }catch (NullPointerException ex){
            System.out.println("Didn't initialize the fly behavior for decoy duck. At the moment, it can't invoke the .quack() method because this.flyBehavior is null");
        }
        try{
            decoyDuck.performQuack();
        }catch (NullPointerException ex){
            System.out.println("Didn't initialize the quack behavior for decoy duck. At the moment, it can't invoke the .quack() method because this.quackBehavior is null");
        }
    }
}
