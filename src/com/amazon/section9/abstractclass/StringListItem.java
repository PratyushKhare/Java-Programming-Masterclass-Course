package com.amazon.section9.abstractclass;

public class StringListItem extends ListItem {
	
	public StringListItem(String val) {
		super(val);
	}

	@Override
	int compareTo(ListItem it) {
		return ((String)this.val).compareTo((String)it.getVal());
	}
}
