package com.amazon.section7;

public class Table {
	private String material;
	private int length, width, height;
	public Table(String material, int length, int width, int height) {
		this.material = material;
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
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
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void useTable() {
		System.out.println(material+" Table is being used....");
	}
}
