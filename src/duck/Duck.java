package duck;

import Fly.FlyBehavior;
import Quack.QuackBehavior;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	
	QuackBehavior quackBehavior;
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
	
	public void swim() {
		System.out.print("游泳");
	}
	
	public abstract void display(); 
	
	
}