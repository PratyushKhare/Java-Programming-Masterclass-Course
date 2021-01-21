package com.amazon.section8;

import java.util.*;

public class AutoboxingUnboxingChallenge {
	private static Scanner sc = new Scanner(System.in);
	private static Bank bank;

	public static void main(String[] args) {
		boolean quit = false;
		printMenu();
		while(!quit) {
			System.out.println("Press 0 to print menu.");
			int i = sc.nextInt();
			sc.nextLine();
			switch(i) {
			case 0:
				printMenu();
				break;
			case 1:
				addBank();
				break;
			case 2:
				addBranch();
				break;
			case 3:
				addCust();
				break;
			case 4:
				addTransaction();
				break;
			case 5:
				addTransactionViaBranch();
				break;
			case 6:
				printBranches();
				break;
			case 7:
				printTransactions();
				break;
			case 8:
				quit = true;
				break;
			}
		}
	}
	
	private static void printMenu() {
		System.out.println("Menu: ");
		System.out.println("\t0. Print Menu");
		System.out.println("\t1. Add Bank");
		System.out.println("\t2. Add Branch");
		System.out.println("\t3. Add Customer");
		System.out.println("\t4. Add Transaction");
		System.out.println("\t5. Add Transaction via Branch");
		System.out.println("\t6. Print Branches");
		System.out.println("\t7. Print All Transactions");
		System.out.println("\t8. Exit");
	}
	
	private static void addBank() {
		System.out.println("Enter name of Bank: ");
		String name = sc.nextLine();
		bank = new Bank(name);
	}
	
	private static void addBranch() {
		if(bank==null) {
			System.out.println("Add a Bank first!");
			return;
		}
		System.out.print("Enter name of Branch: ");
		String name = sc.nextLine();
		bank.addBranch(name);
	}
	
	private static void addCust() {
		if(bank==null) {
			System.out.println("Add a Bank first!");
			return;
		}
		System.out.println("Enter name of Branch: ");
		String br_name = sc.nextLine();
		System.out.println("Enter name of Customer: ");
		String cust_name = sc.nextLine();
		System.out.println("Enter amount to initialize: ");
		double amt = sc.nextDouble();
		bank.addCust(br_name, cust_name, amt);
	}
	
	private static void addTransaction() {
		if(bank==null) {
			System.out.println("Add a Bank first!");
			return;
		}
		System.out.println("Enter name of Customer: ");
		String cust_name = sc.nextLine();
		System.out.println("Enter Transaction amount: ");
		double amt = sc.nextDouble();
		bank.addTransaction(cust_name, amt);
	}
	
	private static void addTransactionViaBranch() {
		if(bank==null) {
			System.out.println("Add a Bank first!");
			return;
		}
		System.out.println("Enter name of Branch: ");
		String br_name = sc.nextLine();
		System.out.println("Enter name of Customer: ");
		String cust_name = sc.nextLine();
		System.out.println("Enter Transaction amount: ");
		double amt = sc.nextDouble();
		bank.addTransaction(br_name, cust_name, amt);
	}

	private static void printBranches() {
		if(bank==null) {
			System.out.println("Add a Bank first!");
			return;
		}
		bank.printAllBranches();
	}
	
	private static void printTransactions() {
		if(bank==null) {
			System.out.println("Add a Bank first!");
			return;
		}
		bank.printAllTransactions();
	}
}
