package com.amazon.section8.linkedlist;

import java.util.*;

public class Album {
	private String name;
	private ArrayList<Song> song_list;
	
	public Album(String name) {
		this.name = name;
		this.song_list = new ArrayList<Song>();
	}
	
	public void addSong(String song_name, double duration) {
		song_list.add(new Song(song_name, duration));
	}
	
	public void printAlbum() {
		System.out.println("Album: "+this.name);
		for(int i=0;i<song_list.size();i++) {
			System.out.println("\t"+song_list.get(i).getName());
		}
	}
	
	public Song getSong(String name) {
		for(int i=0;i<song_list.size();i++) {
			Song curr = song_list.get(i);
			if(curr.getName().equals(name))
				return curr;
		}
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
