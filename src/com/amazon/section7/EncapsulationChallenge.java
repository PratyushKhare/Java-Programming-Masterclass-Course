package com.amazon.section7;

import com.amazon.section7.oops.Burger;

public class EncapsulationChallenge {
	public static void main(String[] args) {
		Printer printer1 = new Printer(99, 2, false);
		printer1.print();
		Printer printer2 = new Printer(10, 2, true);
		printer2.print();
		printer2.fillToner(20);
		printer2.fillToner(80);
		Printer printer3 = new Printer(0, 1000, false);
		printer3.print();
		
	}
}
