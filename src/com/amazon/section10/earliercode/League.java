package com.amazon.section10.earliercode;

import java.util.*;

public class League<T extends Team<Player>> {
	private String name;
	private List<T> teams;
	
	public League(String name) {
		this.name = name;
		this.teams = new ArrayList<T>();
	}
	
	public void addTeam(T t) {
		if(teams.contains(t)) {
			System.out.println("Team already present.");
			return;
		}
		teams.add(t);
	}
	
	public void printTable() {
		Collections.sort(teams);
		System.out.println(this.name+" Table:\n");
		for(T team: teams) {
			System.out.println(team.getName()+" "+team.getPoints());
		}
	}
	
}
