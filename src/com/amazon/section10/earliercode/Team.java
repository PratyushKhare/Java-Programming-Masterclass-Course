package com.amazon.section10.earliercode;

import java.util.*;

public class Team<T extends Player> implements Comparable<Team<T>> {
	private String name;
	private List<T> players;
	private int won,lost,tie,played,points;
	
	public Team(String name) {
		this.name = name;
		this.players = new ArrayList<T>();
	}
	
	public void addPlayer(T player) {
		if(players.contains(player)) {
			System.out.println("Player already in the team");
			return;
		}
		System.out.println(player.getName()+" added to "+this.name);
		players.add(player);
	}
	
	public void matchResult(Team<T> opponent, int our_score, int their_score) {
		String msg = this.name;
		if(our_score > their_score) {
			msg+=" beat ";
			won++;
		} else if(our_score < their_score) {
			msg+=" lost to ";
			lost++;
		} else {
			msg+=" tied to ";
			tie++;
		}
		this.updatePoints();
		played++;
		if(opponent!=null) {
			System.out.println(msg + opponent.name);
			opponent.matchResult(null, their_score, our_score);
		}
	}
	
	private void updatePoints() {
		this.points = won*3 + tie;
	}
	
	@Override
	public int compareTo(Team<T> o) {
		if(this.points > o.points) {
			return -1;
		} else if(this.points < o.points) {
			return 1;
		} else {
			return 0;
		}
	}
	
	//Getters & Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}
	
}
