package com.amazon.section8.arraylist;

import java.util.*;

public class ArrayListChallenge {
	private static Scanner sc = new Scanner(System.in);
	private static MobilePhone mobile = new MobilePhone();
	
	public static void main(String[] args) {
		boolean quit = false;
		printMenu();
		while(!quit) {
			int i = sc.nextInt();
			switch(i) {
			case 0:
				printMenu();
				break;
			case 1:
				addContact();
				break;
			case 2:
				remContact();
				break;
			case 3:
				modifyContact();
				break;
			case 4:
				findContact();
				break;
			case 5:
				printContacts();
				break;
			case 6:
				quit = true;
			}
		}
	}
	private static void printMenu() {
		System.out.println("Menu: ");
		System.out.println("\t0. Print Menu");
		System.out.println("\t1. Add Contact");
		System.out.println("\t2. Remove Contact");
		System.out.println("\t3. Modify Contact");
		System.out.println("\t4. Find Contact");
		System.out.println("\t5. Print Contact");
		System.out.println("\t6. Exit");
	}
	private static void addContact() {
		System.out.print("Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Phone: ");
		String phone = sc.nextLine();
		mobile.addContact(name, phone);
	}
	private static void remContact() {
		System.out.print("Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		mobile.removeContact(name);
	}
	private static void modifyContact() {
		System.out.print("Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("New Name: ");
		String new_name = sc.nextLine();
		System.out.print("New Phone: ");
		String new_phone = sc.nextLine();
		mobile.modifyContact(name, new_name, new_phone);
	}
	private static void findContact() {
		System.out.print("Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		mobile.findContact(name);
	}
	private static void printContacts() {
		mobile.printContacts();
	}
}
