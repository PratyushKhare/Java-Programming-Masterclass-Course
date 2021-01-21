package com.amazon.section9.abstractclass;

public class LinkedList {
	private StringListItem head,tail;
	
	public boolean add(String s) {
		return addItem(new StringListItem(s));
	}
	
	private boolean addItem(StringListItem it) {
		if(head==null) {
			this.head = it;
			this.tail = it;
			return true;
		}
		StringListItem curr = head, prev = null;
		while(curr!=null) {
			int comp = it.compareTo(curr);
			if(comp == 0) {
				System.out.println("Item "+it.getVal()+" already present.");
				return false;
			}
			else if(comp<0) {
				if(prev==null) {
					head = it;
					head.setNext(curr);
					curr.setPrev(head);
					return true;
				}
				else {
					prev.setNext(it);
					it.setPrev(prev);
					it.setNext(curr);
					curr.setPrev(it);
					return true;
				}
			}
			else {
				prev = curr;
				curr = (StringListItem) curr.next();
			}
		}
		prev.setNext(it);
		it.setPrev(prev);
		this.tail = it;
		return true;
	}
	
	public void print(boolean asc) {
		if(head==null)
			return;
		if(asc) {
			StringListItem curr = head;
			while(curr!=null) {
				System.out.println(curr.getVal());
				curr = (StringListItem) curr.next();
			}
		}
		else {
			StringListItem curr = tail;
			while(curr!=null) {
				System.out.println(curr.getVal());
				curr = (StringListItem) curr.prev();
			}
		}
	}
}
