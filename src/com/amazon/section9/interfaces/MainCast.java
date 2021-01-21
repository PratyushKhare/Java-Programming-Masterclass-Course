package com.amazon.section9.interfaces;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCast implements ISaveable {
	private String name;

	public MainCast(String name) {
		this.name = name;
	}
	
	private ArrayList<String> readValues() {
		Scanner sc = new Scanner(System.in);
		boolean quit = false;
		System.out.println("Press: \n\t0 to Quit"
				+ "\n\t1 to Enter String");
		ArrayList<String> values = new ArrayList<String>();
		while(!quit) {
			System.out.println("Enter 0 or 1:");
			int inp = sc.nextInt();
			sc.nextLine();
			switch(inp) {
			case 0:
				quit = true;
				break;
			case 1:
				System.out.println("Enter String:");
				String str = sc.nextLine();
				values.add(str);
			}
		}
		sc.close();
		return values;
	}
	
	public ArrayList<String> save() {
		return readValues();
	}
	
	public void load(ArrayList<String> save_data) {
		System.out.println("Loading "+save_data.size()+" Strings...");
		for(String s: save_data) {
			System.out.println(s);
		}
	}

	@Override
	public String toString() {
		return this.name+" Object";
	}

}
