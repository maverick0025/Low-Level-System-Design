package org.example.patterns.compoundPattern.step5_composite;

import org.example.patterns.compoundPattern.step5_composite.interfaces.Quackable;

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
}
