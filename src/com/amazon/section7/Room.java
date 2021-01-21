package com.amazon.section7;

public class Room {
	private Table table;
	private Bed bed;
	private Door door;
	
	public Room(Table table, Bed bed, Door door) {
		super();
		this.table = table;
		this.bed = bed;
		this.door = door;
	}
	
	public void openDoor() {
		door.openDoor();
	}
	public void closeDoor() {
		door.closeDoor();
	}
	public void sleepOnBed() {
		bed.sleepOnBed();
	}
	public void useTable() {
		table.useTable();
	}
	
}
