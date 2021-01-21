package com.amazon.section9.innerclass;

import java.util.*;

public class Playlist {
	public static Scanner sc = new Scanner(System.in);
	private LinkedList<Song> list = new LinkedList<Song>();
	
	public void addSong(Song s) {
		list.add(s);
	}
	
	public void play() {
		if (list.isEmpty()) {
			System.out.println("PlayList is empty.");
			return;
		}
		ListIterator<Song> it = this.list.listIterator();
		boolean quit = false;
		it.next().play();
		printMenu();
		while (!quit) {
			int i = sc.nextInt();
			switch (i) {
			case 0:
				printMenu();
				break;
			case 1:
				if (it.hasNext())
					it.next().play();
				else 
					System.out.println("You've reached the End of Playlist");
				break;
			case 2:
				it.previous();
				if (it.hasPrevious()) {
					it.previous();
					it.next().play();
				} else {
					it.next();
					System.out.println("You've reached the Starting of playlist.");
				}
				break;
			case 3:
				it.previous();
				it.next().play();
				break;
			case 4:
				quit = true;
			}
		}
	}
	
	private void printMenu() {
		System.out.println("Press: \n"
				+ "0. Print Menu\n"
				+ "1. Skip Forward\n"
				+ "2. Skip Backward\n"
				+ "3. Replay Current Song\n"
				+ "4. Quit");
	}

}
