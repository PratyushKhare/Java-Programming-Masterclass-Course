package com.amazon.section9.abstractclass;

public class AbstractClassChallenge {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		String inp = "Bhopal Bengaluru Chennai Kolkata Jaipur Goa Delhi Mumbai Shimla Goa Bengaluru";
		String[] data = inp.split(" ");
		for(String s: data) {
			ll.add(s);
		}
		
		System.out.println();
		ll.print(true);
		System.out.println();
		ll.print(false);
		
		BST bst = new BST();
		inp = "Pizza Pasta Samosa PaoBhaji Momos Noodles Burger Chat CholeBhature";
		data = inp.split(" ");
		
		for(String s:data) {
			bst.add(s);
		}
		
		System.out.println();
		bst.print();
	}
}
