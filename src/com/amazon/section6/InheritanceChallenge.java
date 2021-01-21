package com.amazon.section6;

public class InheritanceChallenge {
	public static void main(String [] args)
	{
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle(15);
		v1.move();
		v2.move();
		Car c1 = new Car();
		Car c2 = new Car(25);
		c1.move();
		c2.move();
		c2.decreaseSpeedBy(10);
		c2.increaseSpeedBy(20);
		c2.handleSteering();
		Ford f1 = new Ford();
		f1.changeGearTo(1);
	}
}
