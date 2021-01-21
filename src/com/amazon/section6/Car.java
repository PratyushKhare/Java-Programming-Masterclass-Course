package com.amazon.section6;

public class Car extends Vehicle {
	Car() {
	}
	Car(double speed)
	{
		super(speed);
	}
	int wheels = 4;
	void handleSteering()
	{
		System.out.println("Steering is being handled.");
	}
	
}
