package com.amazon.section8.arraylist;

import java.util.*;

public class MobilePhone {
	private ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	public void printContacts() {
		System.out.println("There are "+contacts.size()+" contacts.");
		Iterator <Contact> it = contacts.iterator();
		while(it.hasNext()) {
			Contact c = it.next();
			System.out.println("\tName: "+c.getName()+"\tPhone: "+c.getPhone());
		}
	}
	
	public void addContact(String name, String phone) {
		Contact c = new Contact(name, phone);
		contacts.add(c);
		System.out.println("Contact Added!");
	}
	
	public void removeContact(String name) {
		int index = indexOfContact(name);
		if(index<0) {
			System.out.println("Contact Not Present.");
			return;
		}
		contacts.remove(index);
		System.out.println("Contact Removed Succesfully!");
	}
	
	public void modifyContact(String name, String new_name, String new_phone) {
		int index = indexOfContact(new_name);
		if(index>=0) {
			System.out.println("New Name is already present.");
			return;
		}
		index = indexOfContact(name);
		if(index<0) {
			System.out.println("Name is not present.");
			return;
		}
		Contact c = contacts.get(index);
		c.setName(new_name);
		c.setPhone(new_phone);
		System.out.println("Contact Updated Succesfully!");
	}
	
	private int indexOfContact(String name) {
		Iterator<Contact> it = contacts.iterator();
		int i=0;
		while(it.hasNext()) {
			Contact c = it.next();
			if(c.getName().equals(name))
				return i;
			i++;
		}
		return -1;
	}
	
	public void findContact(String name) {
		int index = indexOfContact(name);
		if(index<0) {
			System.out.println("Contact Not Present.");
			return;
		}
		System.out.println("Contact Found!");
	}
}
