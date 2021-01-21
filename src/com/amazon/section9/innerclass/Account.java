package com.amazon.section9.innerclass;

import java.util.*;

public class Account {
	private String name;
	private ArrayList<Album> album_list;
	private Playlist playlist;
	
	public Account(String name) {
		this.name = name;
		this.album_list = new ArrayList<Album>();
		this.playlist = new Playlist();
	}	
	
	public void addAlbum(Album album) {
		if(this.album_list.contains(album)) {
			System.out.println("Album already present.");
			return;
		}
		album_list.add(album);
	}
	
	private Album getAlbum(String name) {
		for(int i=0;i<this.album_list.size();i++) {
			Album curr = this.album_list.get(i);
			if(curr.getName().equals(name))
				return curr;
		}
		return null;
	}
	
	public boolean addSongToPlaylist(String album_name, String song_name) {
		Album album = getAlbum(album_name);
		if(album==null) {
			System.out.println("Album "+album_name+" doesn't exist in your package.");
			return false;
		}
		Song song = album.getSong(song_name);
		if(song == null) {
			System.out.println("Song "+song_name+" doesn't exist in this album.");
			return false;
		}
		this.playlist.addSong(song);
		System.out.println("Added Succesfully!");
		return true;
	}
	
	public void playPlaylist() {
		playlist.play();
	}
	
	
}
