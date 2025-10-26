package org.example.compoundPattern.step7_observer_flock;

import org.example.compoundPattern.step7_observer_flock.interfaces.Observer;
import org.example.compoundPattern.step7_observer_flock.interfaces.Quackable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {
    List<Quackable> quackers = new ArrayList<>();

    public void addQuacker(Quackable quackable){
        quackers.add(quackable);
    }

    /*@Override
    public void quack() {
        for(Quackable quackable : quackers){
            quackable.quack();
        }
    }*/

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while(iterator.hasNext()){
            Quackable quackie = iterator.next();
            quackie.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {

        Iterator<Quackable> iterator = quackers.iterator();
        while(iterator.hasNext()){
            Quackable duck = iterator.next();
            duck.registerObserver(observer);
        }

    }

    @Override
    public void notifyObservers() {}

    @Override
    public String toString() {
        return "Flock of ducks";
    }
}
