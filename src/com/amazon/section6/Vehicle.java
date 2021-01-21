package com.amazon.section6;

public class Vehicle {
	Vehicle() {
		speed = 0;
	}
	Vehicle(double speed)
	{
		this.speed = speed;
	}
	double speed,d;
	void move()
	{
		System.out.println("Moving at speed "+speed);
	}
	void decreaseSpeedBy(double s)
	{
		if(speed<=s)
			speed = 0;
		else
			speed-=s;
		System.out.println("Speed decreased to "+speed);
	}
	void increaseSpeedBy(double s)
	{
		speed+=s;
		System.out.println("Speed increased to "+speed);
	}
}
