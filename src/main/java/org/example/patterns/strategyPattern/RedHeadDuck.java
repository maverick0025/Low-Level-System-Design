package org.example.patterns.strategyPattern;

import org.example.patterns.strategyPattern.flyBeh.FlyWithWings;
import org.example.patterns.strategyPattern.quackBeh.Quack;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
