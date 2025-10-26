package org.example.compoundPattern.step4_factory.adapter;

import org.example.compoundPattern.step4_factory.interfaces.Honkable;
import org.example.compoundPattern.step4_factory.interfaces.Quackable;

public class GooseAdapter implements Quackable {
    Honkable honkable;

    public GooseAdapter(Honkable honkable) {
        this.honkable = honkable;
    }

    public void quack(){
        honkable.honk();
    }
}
