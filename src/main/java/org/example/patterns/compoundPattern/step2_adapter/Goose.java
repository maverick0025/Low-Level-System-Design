package org.example.patterns.compoundPattern.step2_adapter;

import org.example.patterns.compoundPattern.step2_adapter.interfaces.Honkable;

public class Goose implements Honkable {
    public void honk(){
        System.out.println("Honk");
    }

}
