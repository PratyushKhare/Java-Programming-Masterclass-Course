package com.amazon.section7.oops;

class Chips {
	private String name = "Potato Chips";
	private double price;
	
	public Chips(double price) {
		this.price = price;
	}

	String getName() {
		return name;
	}
	
}

class SoftDrink {
	private String name = "Coca Cola";
	private double price;
	
	String getName() {
		return name;
	}
}

public class DeluxeBurger extends Burger {
	Chips chips;
	SoftDrink softDrink;
	public DeluxeBurger(String breadRollType, boolean meat, double base_price, double lettuce_price, double tomato_price,
			double carrot_price, double onion_price, double cheese_price, Chips chips, SoftDrink softDrink) {
		super(breadRollType, meat, base_price, lettuce_price, tomato_price, carrot_price, onion_price, cheese_price);
		this.chips = chips;
		this.softDrink = softDrink;
		setMax_count(0);
	}
	@Override
	public void additionalPrice() {
		System.out.println("ADDITIONAL ITEMS: ");
		System.out.println(chips.getName()+": \t0");
		System.out.println(softDrink.getName()+": \t0");
	}
}
