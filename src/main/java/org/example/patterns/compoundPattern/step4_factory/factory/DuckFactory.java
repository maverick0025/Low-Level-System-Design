package org.example.patterns.compoundPattern.step4_factory.factory;

import org.example.compoundPattern.step4_factory.animals.*;
import org.example.patterns.compoundPattern.step4_factory.animals.DuckCall;
import org.example.patterns.compoundPattern.step4_factory.animals.MallardDuck;
import org.example.patterns.compoundPattern.step4_factory.animals.RedheadDuck;
import org.example.patterns.compoundPattern.step4_factory.animals.RubberDuck;
import org.example.patterns.compoundPattern.step4_factory.interfaces.Quackable;

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
}
