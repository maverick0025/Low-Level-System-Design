package org.example.compoundPattern.step2_adapter.adapter;

import org.example.compoundPattern.step2_adapter.interfaces.Honkable;
import org.example.compoundPattern.step2_adapter.interfaces.Quackable;

public class GooseAdapter implements Quackable {
    Honkable honkable;

    public GooseAdapter(Honkable honkable) {
        this.honkable = honkable;
    }

    public void quack(){
        honkable.honk();
    }
}
