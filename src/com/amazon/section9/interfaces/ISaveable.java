package com.amazon.section9.interfaces;

import java.util.ArrayList;

public interface ISaveable {
	ArrayList<String> save();
	void load(ArrayList<String> alist);
}
