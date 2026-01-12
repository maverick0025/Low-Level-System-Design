package org.example.patterns.adapterPattern.step1_ducks;

import org.example.patterns.adapterPattern.step1_ducks.interfaces.Duck;
import org.example.patterns.adapterPattern.step1_ducks.interfaces.Turkey;

public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i =0; i<3; i++){
            turkey.fly();
        }
    }
}
