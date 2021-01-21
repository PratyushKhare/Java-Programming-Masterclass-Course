package com.amazon.section7.oops;

import com.amazon.section7.Door;

public class OOPMasterChallenge {
	public static void main(String[] args) {
		System.out.println("Classic Burger!\n");
		Burger burger = new Burger("White Bread", false, 30, 5, 4, 6, 5, 10);
		burger.addLettuce();
		burger.addOnion();
		burger.addCarrot();
		burger.remCarrot();
		burger.addTomato();
		burger.addCheese();
		burger.totalPrice();
		
		System.out.println("\nHealthy Burger!\n");
		HealthyBurger hburger = new HealthyBurger(false, 40, 5, 4, 6, 5, 10, 6, 8);
		hburger.addCarrot();
		hburger.addLettuce();
		hburger.addOnion();
		hburger.remOnion();
		hburger.addTomato();
		hburger.addSauce();
		hburger.addMushroom();
		hburger.addCheese();
		hburger.totalPrice();
		
		System.out.println("\nDeluxe Burger!\n");
		Chips chips = new Chips(15);
		SoftDrink softDrink = new SoftDrink();
		DeluxeBurger dburger = new DeluxeBurger("White Bread", true, 50, 6, 7, 7, 8, 8, chips, softDrink);
		dburger.totalPrice();
		
	}	
}
