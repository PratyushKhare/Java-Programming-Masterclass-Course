package com.amazon.section9.innerclass;

public class InnerClassChallenge {

	public static void main(String[] args) {
		Album a1 = new Album("Arijit Singh");
		a1.addSong("Tum Hi Ho", 3.5);
		a1.addSong("Khairiyat", 4.4);
		a1.addSong("Shayad", 3.6);
		a1.addSong("Channa Mereya", 3.4);
		a1.addSong("Ghungroo", 5.02);
		a1.printAlbum();
		
		Album a2 = new Album("Charlie Puth");
		a2.addSong("Attention", 3.6);
		a2.addSong("Summer Feelings", 3.4);
		a2.addSong("LA Girls", 2.9);
		a2.addSong("Done for Me", 3.2);
		a2.addSong("Girlfriend", 2.57);
		a2.printAlbum();
		
		Account acc = new Account("PKK");
		acc.addAlbum(a1);
		acc.addSongToPlaylist("Arijit Singh", "Khairiyat");
		acc.addSongToPlaylist("Arijit Singh", "Ghungroo");
		acc.addSongToPlaylist("Arijit Singh", "Shayad");
		Album a1dummy = a1;
		acc.addAlbum(a1dummy);
		
		acc.addAlbum(a2);
		acc.addSongToPlaylist("Charlie Puth", "Attention");
		acc.addSongToPlaylist("Charlie Puth", "LA Girls");
		acc.addSongToPlaylist("Charlie Puth", "Summer Feelings");
		acc.addSongToPlaylist("Charlie Puth", "Girlfriend");
		
		acc.playPlaylist();
		
	}

}
