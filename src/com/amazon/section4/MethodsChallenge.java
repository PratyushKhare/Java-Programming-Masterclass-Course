package com.amazon.section4;

public class MethodsChallenge {

	public static void main(String[] args) {
		displayHighScorePosition("Allen",calculateHighScorePosition(1000));
		displayHighScorePosition("Bhavesh",calculateHighScorePosition(900));
		displayHighScorePosition("Dinesh",calculateHighScorePosition(400));
		displayHighScorePosition("Esha",calculateHighScorePosition(50));
	}
	static int calculateHighScorePosition(int score)
	{
		if(score>=1000) 
		{
			return 1;
		}
		else if(score>=500)
		{
			return 2;
		}
		else if(score>=100)
		{
			return 3;
		}
		return 4;
	}
	static void displayHighScorePosition(String name, int position) 
	{
		System.out.println(name + " managed to get into position " + position + " on the high score table");
	}
}
