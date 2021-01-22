package com.amazon.section9.abstractclass;

public abstract class ListItem {
	protected ListItem prev,next;
	protected Object val;
	
	public ListItem(Object val) {
		this.val = val;
	}
	
	public Object getVal() {
		return val;
	}

	public void setVal(Object val) {
		this.val = val;
	}

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
	
	abstract int compareTo(ListItem it);
}
