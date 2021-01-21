package com.amazon.section8;

import java.util.ArrayList;

public class Bank {
	private String name;
	private ArrayList<Branch> branches;
	
	public Bank(String name) {
		this.name = name;
		branches = new ArrayList<Branch>();
	}
	
	public boolean addBranch(String name) {
		branches.add(new Branch(name));
		return true;
	}
	
	private Branch findBranch(String name) {
		for(int i=0;i<branches.size();i++) {
			if(this.branches.get(i).getName().equals(name)) {
				return this.branches.get(i);
			}
		}
		return null;
	}
	
	public boolean addCust(String br_name, String cust_name, double amt) {
		Branch branch = findBranch(br_name);
		if(branch==null) {
			System.out.println("Branch name: "+br_name+" is not present.");
			return false;
		}
		return branch.addCustomer(cust_name, amt);
	}
	
	public boolean addTransaction(String br_name, String cust_name, double amt) {
		Branch branch = findBranch(br_name);
		if(branch==null) {
			System.out.println("Branch name: "+br_name+" is not present.");
			return false;
		}
		return branch.addTransaction(cust_name, amt);
	}
	
	public boolean addTransaction(String cust_name, double amt) {
		for(int i=0;i<branches.size();i++) {
			System.out.println("Searching Branch name: "+branches.get(i).getName()+" .......");
			if(branches.get(i).addTransaction(cust_name, amt)) {
				return true;
			}
		}
		return false;
	}
	
	public void printAllBranches() {
		System.out.println("Bank Name: "+this.name+'\n');
		System.out.println("There are "+branches.size()+" branches.");
		for(int i=0;i<branches.size();i++) {
			System.out.println("\t"+branches.get(i).getName());
		}
	}

	public void printAllTransactions() {
		System.out.println("Bank Name: "+this.name+'\n');
		System.out.println("There are "+branches.size()+" branches.");
		for(int i=0;i<branches.size();i++) {
			System.out.println("\t"+branches.get(i).getName());
			System.out.print("\t");
			branches.get(i).printAllTransactions();
		}
	}
}
