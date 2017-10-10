package duck;

import Fly.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.performQuack();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}

}
