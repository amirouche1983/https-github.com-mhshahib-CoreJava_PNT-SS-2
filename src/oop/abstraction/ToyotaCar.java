package oop.abstraction;

public class ToyotaCar extends FlyingCar implements Car, BoostEngine {

	@Override
	public void carStart() {
		System.out.println("Toyota Car have start Feature");
	}

	@Override
	public void carStrop() {
		System.out.println("Toyota Car have stop Feature");
	}

	@Override
	public void carEngine() {
		System.out.println("Toyota Car have Engine");
	}

	@Override
	public void carWheel() {
		System.out.println("Toyota Car have Wheel");
	}

	@Override
	public void flyingFeature() {
		System.out.println("Toyota Car have Flying Feature");

	}

	@Override
	public void boostEngine() {
		System.out.println("Toyota Car introduce Boost Engine");
	}

	@Override
	public void autoPilotFeature() {
		// TODO Auto-generated method stub
		System.out.println("Toyota Car introduce AutoPilot Feature");

	}

}
