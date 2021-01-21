package com.amazon.section4;

public class MethodOverloadingChallenge {

	public static void main(String[] args) {
		System.out.println(calcFeetAndInchesToCentimeters(7, 5)); 
		System.out.println(calcFeetAndInchesToCentimeters(157)); 
	}
	static double calcFeetAndInchesToCentimeters(double feet, double inches)
	{
		if(feet<0 || inches<0 || inches >12)
		{
			return -1;
		}
		return (12*feet+inches)*2.54;
	}
	static double calcFeetAndInchesToCentimeters(double inches)
	{
		if(inches<0)
		{
			return -1;
		}
		double feet = inches/12;
		inches = inches%12;
		return calcFeetAndInchesToCentimeters(feet,inches);
	}

}
