package org.example.patterns.compoundPattern.step7_observer_flock.factory;

import org.example.patterns.compoundPattern.step5_composite.animals.DuckCall;
import org.example.patterns.compoundPattern.step5_composite.animals.MallardDuck;
import org.example.patterns.compoundPattern.step5_composite.animals.RedheadDuck;
import org.example.patterns.compoundPattern.step5_composite.animals.RubberDuck;
import org.example.patterns.compoundPattern.step5_composite.factory.AbstractDuckFactory;
import org.example.patterns.compoundPattern.step5_composite.interfaces.Quackable;

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
