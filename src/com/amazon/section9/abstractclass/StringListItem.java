package com.amazon.section9.abstractclass;

public class StringListItem extends ListItem {
	private String val;
	
	public StringListItem(String val) {
		this.val = val;
	}
	
	public String getVal() {
		return val;
	}

	public int compareTo(StringListItem it) {
		return this.val.compareTo(it.getVal());
	}
}
