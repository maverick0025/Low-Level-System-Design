package org.example.compoundPattern.step2_adapter;

import org.example.compoundPattern.step2_adapter.interfaces.Honkable;
import org.example.compoundPattern.step2_adapter.interfaces.Quackable;

public class Goose implements Honkable {
    public void honk(){
        System.out.println("Honk");
    }

}
