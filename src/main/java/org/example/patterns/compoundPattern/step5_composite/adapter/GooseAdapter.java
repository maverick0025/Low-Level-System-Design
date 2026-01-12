package org.example.patterns.compoundPattern.step5_composite.adapter;

import org.example.patterns.compoundPattern.step5_composite.interfaces.Honkable;
import org.example.patterns.compoundPattern.step5_composite.interfaces.Quackable;

public class GooseAdapter implements Quackable {
    Honkable honkable;

    public GooseAdapter(Honkable honkable) {
        this.honkable = honkable;
    }

    public void quack(){
        honkable.honk();
    }
}
