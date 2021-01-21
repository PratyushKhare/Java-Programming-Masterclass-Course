package com.amazon.section7;

public class Printer {
	private int toner_lvl = 100, printed_pages = 0;
	private boolean duplex;
	
	public Printer(int toner_lvl, int printed_pages, boolean duplex) {
		if(toner_lvl>=0 && toner_lvl<=100)
			this.toner_lvl = toner_lvl;
		if(printed_pages>=0)
			this.printed_pages = printed_pages;
		this.duplex = duplex;
	}
	
	public void fillToner(int val) {
		if(val<0)
			return;
		if((toner_lvl + val)>100)
			toner_lvl = 100;
		else
			toner_lvl+=val;
		System.out.println("Filling Toner...... Toner Level is now "+toner_lvl);
	}
	
	public void print() {
		if(toner_lvl!=0) {
			if(duplex) {
				System.out.println("Printing Front Page...");
				System.out.println("Printing Back Page...");
				printed_pages+=2;			
			}
			else {
				System.out.println("Printing Page...");
				printed_pages++;
			}
		}
		else
			System.out.println("Not enough Toner!");
	}
	
}
