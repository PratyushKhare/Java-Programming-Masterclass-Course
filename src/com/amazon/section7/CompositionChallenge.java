package com.amazon.section7;

public class CompositionChallenge {
	public static void main(String[] args) {
		Room room = new Room(new Table("Oak",24, 12, 35), new Bed(50, 25, 20, "Mahogany"), new Door(80, 25));

		room.closeDoor();
		room.openDoor();
		room.sleepOnBed();
		room.useTable();
		room.closeDoor();
		
//		Door door = room.getDoor();
//		door.closeDoor();
//		door.openDoor();
//		
//		Bed bed = room.getBed();
//		bed.sleepOnBed();
//		
//		Table table = room.getTable();
//		table.useTable();
//		
//		door.closeDoor();
	}

}
