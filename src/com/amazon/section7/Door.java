package com.amazon.section7;

public class Door {
	private int length, width;
	private boolean open = true;

	public Door(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public void openDoor() {
		if(open)
			return;
		open = true;
		System.out.println("Door is now Open.");
	}
	
	public void closeDoor() {
		if(!open)
			return;
		open = false;
		System.out.println("Door is now Closed.");
	}

}
