package com.amazon.section7.oops;

public class HealthyBurger extends Burger {
	private boolean mushroom, sauce;
	private double mushroom_price, sauce_price;
	
	public HealthyBurger(boolean meat, double base_price, double lettuce_price,
			double tomato_price, double carrot_price, double onion_price, double cheese_price, double mushroom_price,
			double sauce_price) {
		super("Brown rye", meat, base_price, lettuce_price, tomato_price, carrot_price, onion_price, cheese_price);
		this.mushroom_price = mushroom_price;
		this.sauce_price = sauce_price;
		setMax_count(6);
	}

	public void addMushroom() {
		if(!full())
		{
			mushroom = true;
			setTotal_cost(getTotal_cost() + mushroom_price);
			setCount(getCount()+1);
			System.out.println("Mushroom Added!");
		}
	}
	
	public void remMushroom() {
		if(!empty() && mushroom)
		{
			mushroom = false;
			setTotal_cost(getTotal_cost() - mushroom_price);
			setCount(getCount()-1);
			System.out.println("Mushroom Removed.");
		}
	}
	
	public void addSauce() {
		if(!full())
		{
			sauce = true;
			setTotal_cost(getTotal_cost() + sauce_price);
			setCount(getCount()+1);
			System.out.println("Sauce Added!");
		}
	}
	
	public void remSauce() {
		if(!empty() && sauce)
		{
			sauce = false;
			setTotal_cost(getTotal_cost() - sauce_price);
			setCount(getCount()-1);
			System.out.println("Sauce Removed.");
		}
	}
	
	@Override
	public void additionalPrice() {
		super.additionalPrice();
		if(mushroom)
			System.out.println("mushroom: \t" + mushroom_price);
		if(sauce)
			System.out.println("sauce: \t" + sauce_price);
	}

}
