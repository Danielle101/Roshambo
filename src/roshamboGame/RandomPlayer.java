package roshamboGame;

import java.util.Random;

	public class RandomPlayer extends Player
	{
	public RandomPlayer()
	{
	name = "The Sharks";
	}

	/**
	*
	* @return
	*/
	@Override
	public Roshambo generateRoshambo()
	{
	//random generator selects rock,paper, or scissors
	  
	Random r=new Random();
	int ch=r.nextInt(3);
	if(ch==0) return Roshambo.ROCK;
	else if(ch==1) return Roshambo.PAPER;
	else return Roshambo.SCISSORS;
	}
	}
