package org.example.compoundPattern.step2_adapter;

import org.example.compoundPattern.step2_adapter.interfaces.Quackable;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
