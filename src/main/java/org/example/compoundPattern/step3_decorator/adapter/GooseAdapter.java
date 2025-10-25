package org.example.compoundPattern.step3_decorator.adapter;

import org.example.compoundPattern.step3_decorator.interfaces.Honkable;
import org.example.compoundPattern.step3_decorator.interfaces.Quackable;

public class GooseAdapter implements Quackable {
    Honkable honkable;

    public GooseAdapter(Honkable honkable) {
        this.honkable = honkable;
    }

    public void quack(){
        honkable.honk();
    }
}
