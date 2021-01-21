package com.amazon.section9.innerclass;

import java.util.*;

public class Album {
	private String name;
	private SongList songs;
	
	public Album(String name) {
		this.name = name;
		songs = new SongList();
	}
	
	public void addSong(String song_name, double duration) {
		songs.addSong(song_name, duration);
	}
	
	public void printAlbum() {
		songs.printAlbum();
	}
	
	public Song getSong(String name) {
		Song ret = songs.getSong(name);
		return ret;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private class SongList {
		List<Song> song_list;

		public SongList() {
			song_list = new ArrayList<Song>();
		}
		
		public void addSong(String song_name, double duration) {
			song_list.add(new Song(song_name, duration));
		}
		
		public void printAlbum() {
			System.out.println("Album: "+Album.this.name);
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
		
	}
	
}
