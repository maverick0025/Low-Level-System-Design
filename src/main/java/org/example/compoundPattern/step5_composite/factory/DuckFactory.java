package org.example.compoundPattern.step5_composite.factory;

import org.example.compoundPattern.step5_composite.animals.*;
import org.example.compoundPattern.step5_composite.interfaces.Quackable;

public class DuckFactory extends AbstractDuckFactory {
  
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}
  
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}

	@Override
	public Quackable createDecoyDuck() {
		return null;
	}

	public Quackable createDuckCall() {
		return new DuckCall();
	}
   
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}

	@Override
	public Quackable createGoose() {
		return null;
	}
}
