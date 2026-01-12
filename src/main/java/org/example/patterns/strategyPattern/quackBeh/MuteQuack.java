package org.example.patterns.strategyPattern.quackBeh;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
