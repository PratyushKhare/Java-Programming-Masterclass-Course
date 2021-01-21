package com.amazon.section9.abstractclass;

public abstract class ListItem {
	private ListItem prev,next;
	
	public ListItem prev() {
		return this.prev;
	}
	
	public ListItem next() {
		return this.next;
	}

	public void setPrev(ListItem prev) {
		this.prev = prev;
	}

	public void setNext(ListItem next) {
		this.next = next;
	}
	
}
