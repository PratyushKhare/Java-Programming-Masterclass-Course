package com.amazon.section9.abstractclass;

public class BST {
	private StringListItem root;
	
	public boolean add(String s) {
		return addItem(root, new StringListItem(s));
	}
	
	private boolean addItem(StringListItem node, StringListItem it) {
		if(root == null) {
			this.root = it;
			return true;
		}
		int comp = it.compareTo(node);
		if(comp == 0) {
			return false;
		}
		else if(comp<0) {
			if(node.prev() == null) {
				node.setPrev(it);
				return true;
			}
			return addItem((StringListItem)node.prev(),it);
		}
		else {
			if(node.next() == null) {
				node.setNext(it);
				return true;
			}
			return addItem((StringListItem) node.next(),it);
		}
	}
	
	public void print() {
		print(root);
	}
	
	private void print(StringListItem node) {
		if(node==null) {
			return;
		}
		print((StringListItem)node.prev());
		System.out.println(node.getVal());
		print((StringListItem)node.next());
	}
}
