package com.amazon.section8;

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Double> transactions;
	
	public Customer(String name, double init) {
		this.name = name;
		transactions = new ArrayList<Double>();
		transactions.add(init);
	}
	
	public boolean addTransaction(double amt) {
		transactions.add(amt);
		System.out.println("Transaction added for "+this.name);
		return true;
	}
	
	public void printTransactions() {
		System.out.println(this.name+" has "+transactions.size()+" transactions.");
		for(int i=0;i<this.transactions.size();i++) {
			System.out.print(this.transactions.get(i)+" ");
		}
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
