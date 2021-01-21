package com.amazon.section3;

public class Operators {

	public static void main(String[] args) {
		double d1 = 20.00, d2 = 80.00;
		double res = (d1+d2)*100.00;
		double rem = res % 40.00;
		boolean isZero = (rem==0) ? true : false;
		System.out.println(isZero);
		if(!isZero) 
		{
			System.out.println("Got some remainder");
		}
		
	}

}
