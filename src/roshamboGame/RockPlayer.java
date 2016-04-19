package roshamboGame;

public class RockPlayer extends Player {
	
	public RockPlayer()
	{
	name = "The Jets";
	}

	@Override
	public Roshambo generateRoshambo()
	{   
	return Roshambo.ROCK;
	}
}
