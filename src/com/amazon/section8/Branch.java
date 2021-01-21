package com.amazon.section8;

import java.util.ArrayList;

public class Branch {
	private String name;
	private ArrayList<Customer> customers;
	
	public Branch(String name) {
		this.name = name;
		customers = new ArrayList<Customer>();
	}
	
	public boolean addCustomer(String name, double amt) {
		if(findCustomer(name)!=null) {
			System.out.println("Customer is already present.");
			return false;
		}
		this.customers.add(new Customer(name,amt));
		return true;
	}
	
	private Customer findCustomer(String name) {
		for(int i=0;i<this.customers.size();i++) {
			if(this.customers.get(i).getName().equals(name)) {
				return this.customers.get(i);
			}
		}
		return null;
	}
	
	public boolean addTransaction(String name, double amt) {
		Customer c = findCustomer(name); 
		if(c==null) {
			System.out.println("There were no customers by the name: "+name);
			return false;
		}
		c.addTransaction(amt);
		return true;
	}
	
	public void printTransactions(String name) {
		Customer c = findCustomer(name);
		if(c==null) {
			System.out.println("There were no customers by the name: "+name);
		}
		c.printTransactions();
	}
	
	public void printAllTransactions() {
		for(int i=0;i<customers.size();i++) {
			customers.get(i).printTransactions();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
