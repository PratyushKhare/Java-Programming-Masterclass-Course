package com.amazon.section6;

public class Ford extends Car {
	Ford() {
		//super();
	}
	Ford(double speed)
	{
		super(speed);
	}
	int gear = 0;
	void changeGearTo(int g)
	{
		if(g>5)
		{
			System.out.println("Invalid gear!");
			return;
		}
		gear = g;
		System.out.println("Car is now at gear "+gear);
	}

}
