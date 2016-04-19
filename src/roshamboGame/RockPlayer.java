package roshamboGame;

public class RockPlayer extends Player {
	
	public RockPlayer()
	{
	name = "The Jets";
	}

	//implements the generateRoshambo method from the Player class
	@Override
	public Roshambo generateRoshambo()
	{   
	return Roshambo.ROCK;
	}
}
