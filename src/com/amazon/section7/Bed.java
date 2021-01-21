package com.amazon.section7;

public class Bed {
	private int length, width, height;
	private String material;
	public Bed(int length, int width, int height, String material) {
		this.length = length;
		this.width = width;
		this.height = height;
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
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public void sleepOnBed() {
		System.out.println("Sleeping on "+material+" bed of dimensions: "+length+"x"+width+"x"+height);
	}
}
