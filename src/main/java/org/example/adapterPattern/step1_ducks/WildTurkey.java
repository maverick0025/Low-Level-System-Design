package org.example.adapterPattern.step1_ducks;

import org.example.adapterPattern.step1_ducks.interfaces.Turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble Gobble");
    }

    @Override
    public void fly() {
        System.out.println("I fly baja distances solo");
    }
}
