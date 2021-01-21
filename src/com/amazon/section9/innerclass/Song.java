package com.amazon.section9.innerclass;

public class Song {
	private String name;
	private double duration;

	public Song(String name, double duration) {
		this.name = name;
		this.duration = duration;
	}

	public void play() {
		System.out.println("Now playing: " + this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDuration() {
		return duration;
	}
	
}
