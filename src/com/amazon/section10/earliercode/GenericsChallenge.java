package com.amazon.section10.earliercode;

public class GenericsChallenge {

	public static void main(String[] args) {
		FootballPlayer messi = new FootballPlayer("Lionel Messi");
		FootballPlayer ronaldo = new FootballPlayer("Cristiano Ronaldo");
		FootballPlayer xavi = new FootballPlayer("Xavi Hernandes");
		FootballPlayer iniesta = new FootballPlayer("Andres Iniesta");
		FootballPlayer mbappe = new FootballPlayer("Kylian Mbappe");
		FootballPlayer kevin = new FootballPlayer("Kevin De Bruyne");
		
		FootballTeam<FootballPlayer> barca = new FootballTeam<>("Barcelona");
		barca.addPlayer(messi);
		barca.addPlayer(xavi);
		barca.addPlayer(iniesta);
		FootballTeam<FootballPlayer> psg = new FootballTeam<>("PSG");
		psg.addPlayer(mbappe);
		FootballTeam<FootballPlayer> juve = new FootballTeam<>("Juventus");
		juve.addPlayer(ronaldo);
		FootballTeam<FootballPlayer> manc = new FootballTeam<>("Manchester City");
		manc.addPlayer(kevin);
		
		barca.matchResult(juve, 3, 1);
		juve.matchResult(barca, 2, 1);
		juve.matchResult(manc, 0, 4);
		psg.matchResult(barca, 2, 3);
		manc.matchResult(barca, 2, 2);
		
		League<FootballTeam<FootballPlayer>> cl = new League<FootballTeam<FootballPlayer>>("Champions League") ;
		cl.addTeam(barca);
		cl.addTeam(juve);
		cl.addTeam(psg);
		cl.addTeam(manc);
		
		cl.printTable();
		
//		CricketTeam<CricketPlayer> rcb = new CricketTeam<CricketPlayer>("Royal Challengers Bangalore");
//		cl.addTeam(rcb);
	}
}
