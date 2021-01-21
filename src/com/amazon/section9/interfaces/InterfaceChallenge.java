package com.amazon.section9.interfaces;

import java.util.ArrayList;

public class InterfaceChallenge {
	private static ArrayList<String> save_data;
	public static void main(String[] args) {
		Players gintoki = new Players("Sakata Gintoki");
		MainCast hijikata = new MainCast("Hijikata Toshiro");
		save(gintoki);
		load(hijikata);
	}
	
	public static void save(ISaveable obj) {
		System.out.println("Saving "+obj.toString());
		save_data = obj.save();
	}
	
	public static void load(ISaveable obj) {
		if(save_data == null) {
			System.out.println("No Save yet");
			return;
		}
		System.out.println("Loading to "+obj.toString());
		obj.load(save_data);
	}
}
