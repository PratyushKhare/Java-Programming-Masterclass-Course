package com.amazon.section7.oops;

public class Burger {
	private String name = "Burger";
	private String breadRollType;
	private boolean meat;
	private boolean lettuce, tomato, carrot, onion, cheese;
	private double base_price, lettuce_price, tomato_price, carrot_price, onion_price, cheese_price;
	private int max_count=4, count;
	private double total_cost;
	
	public Burger(String breadRollType, boolean meat, double base_price, double lettuce_price, double tomato_price,
			double carrot_price, double onion_price, double cheese_price) {
		this.breadRollType = breadRollType;
		this.meat = meat;
		this.base_price = base_price;
		this.lettuce_price = lettuce_price;
		this.tomato_price = tomato_price;
		this.carrot_price = carrot_price;
		this.onion_price = onion_price;
		this.cheese_price = cheese_price;
		total_cost = base_price;
	}
	
	public boolean full() {
		if(count>=max_count)
			return true;
		return false;
	}
	public boolean empty() {
		if(count==0)
			return true;
		return false;
	}
	
	public void addLettuce() {
		if(!full()) 
		{
			lettuce = true;
			total_cost += lettuce_price;
			count++;
			System.out.println("Lettuce Added!");
		}
	}
	public void remLettuce() {
		if(!empty() && lettuce)
		{
			lettuce = false;
			total_cost -= lettuce_price;
			count--;
			System.out.println("Lettuce Removed.");
		}
	}
	
	public void addTomato() {
		if(!full()) 
		{
			tomato = true;
			total_cost += tomato_price;
			count++;
			System.out.println("Tomato Added!");
		}
	}
	public void remTomato() {
		if(!empty() && tomato)
		{
			tomato = false;
			total_cost -= tomato_price;
			count--;
			System.out.println("Tomato Removed.");
		}
	}
	
	public void addCarrot() {
		if(!full()) 
		{
			carrot = true;
			total_cost += carrot_price;
			count++;
			System.out.println("Carrot Added!");
		}
	}
	public void remCarrot() {
		if(!empty() && carrot)
		{
			carrot = false;
			total_cost -= carrot_price;
			count--;
			System.out.println("Carrot Removed.");
		}
	}
	
	public void addOnion() {
		if(!full()) 
		{
			onion = true;
			total_cost += onion_price;
			count++;
			System.out.println("Onion Added!");
		}
	}
	public void remOnion() {
		if(!empty() && onion)
		{
			onion = false;
			total_cost -= onion_price;
			count--;
			System.out.println("Onion Removed.");
		}
	}
	
	public void addCheese() {
		if(!full()) 
		{
			cheese = true;
			total_cost += cheese_price;
			count++;
			System.out.println("Cheese Added!");
		}
	}
	public void remCheese() {
		if(!empty() && cheese)
		{
			cheese = false;
			total_cost -= cheese_price;
			count--;
			System.out.println("Cheese Removed.");
		}
	}
	
	public void basePrice() {
		System.out.println("BASE PRICE: \t" + base_price);
	}
	public void additionalPrice() {
		System.out.println("ADDITIONAL PRICE: ");
		if(lettuce)
			System.out.println("lettuce: \t" + lettuce_price);
		if(tomato)
			System.out.println("tomato: \t" + tomato_price);
		if(carrot)
			System.out.println("carrot: \t" + carrot_price);
		if(onion)
			System.out.println("onion: \t" + onion_price);
		if(cheese)
			System.out.println("cheese: \t" + cheese_price);
	}
	public void totalPrice() {
		basePrice();
		additionalPrice();
		System.out.println("TOTAL: \t" + total_cost);
	}

	void setMax_count(int max_count) {
		this.max_count = max_count;
	}

	int getCount() {
		return count;
	}
	void setCount(int count) {
		this.count = count;
	}

	
	double getTotal_cost() {
		return total_cost;
	}
	void setTotal_cost(double total_cost) {
		this.total_cost = total_cost;
	}
	
	
	
}
