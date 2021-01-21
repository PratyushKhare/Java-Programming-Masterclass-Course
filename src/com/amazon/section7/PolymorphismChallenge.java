package com.amazon.section7;

class Car {
	private String name;
	private int numCylinders, numWheels = 4;
	private boolean engine = true;
	
	public Car(String name, int numCylinders) {
		this.name = name;
		this.numCylinders = numCylinders;
	}
	
	public String getName() {
		return name;
	}

	public void startEngine() {
		System.out.println("Car's engine has started....");
	}
	public void accelerate() {
		System.out.println("Car is accelerating!!!");
	}
	public void brake() {
		System.out.println("Car's brake is pushed.");
	}
}

public class PolymorphismChallenge {
	public static void main(String[] args) {
		Car car = new Car("Some Car", 2);
		car.startEngine();
		car.accelerate();
		car.brake();
		
		Lamborghini lamb = new Lamborghini(4);
		lamb.startEngine();
		lamb.accelerate();
		lamb.brake();
		
		Audi audi = new Audi(4);
		audi.startEngine();
		audi.accelerate();
		audi.brake();
		
		Mercedes merc = new Mercedes(4);
		merc.startEngine();
		merc.accelerate();
		merc.brake();
	}
}

class Lamborghini extends Car {
	
	Lamborghini(int numCylinders) {
		super("Lamborghini Gallardo", numCylinders);
	}

	@Override
	public void startEngine() {
		System.out.println(super.getName() + " starts its engine...!");
	}

	@Override
	public void accelerate() {
		System.out.println(super.getName() + " accelerates!!!");
	}

	@Override
	public void brake() {
		System.out.println(super.getName() + " applies its brakes.");
	}
	
}

class Audi extends Car {
	
	Audi(int numCylinders) {
		super("Audi R8", numCylinders);
	}

	@Override
	public void startEngine() {
		System.out.println(super.getName() + " starts its engine...!");
	}

	@Override
	public void accelerate() {
		System.out.println(super.getName() + " accelerates!!!");
	}

	@Override
	public void brake() {
		System.out.println(super.getName() + " applies its brakes.");
	}
	
}

class Mercedes extends Car {
	
	Mercedes(int numCylinders) {
		super("Mercedes AMG GT", numCylinders);
	}

	@Override
	public void startEngine() {
		System.out.println(super.getName() + " starts its engine...!");
	}

	@Override
	public void accelerate() {
		System.out.println(super.getName() + " accelerates!!!");
	}

	@Override
	public void brake() {
		System.out.println(super.getName() + " applies its brakes.");
	}
	
}

