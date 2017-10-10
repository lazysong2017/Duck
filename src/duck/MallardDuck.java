package duck;

import Fly.FlyWithWings;
import Quack.Quack;

public class MallardDuck  extends Duck{
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		
		System.out.println("I'm a real Mallard duck.");
	}
	
	public static void main(String[] args) {                                                                                                              
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
	}

}
