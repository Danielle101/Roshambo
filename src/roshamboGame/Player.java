package roshamboGame;

	public abstract class Player {
	  
	public String name;
	public String response;

	public Player() {}
	  
	//set method for name
	public void setName(String name)
	{
	this.name = name;
	}
	  
	//get method for name
	public String getName()
	{
	return name;
	}
	  
	//set method for response
	public void setResponse(String response)
	{
	this.response = response;
	}
	  
	//get method for response
	public String getResponse()
	{
	return response;
	}
	  
	//method to generate and return a Roshambo value
	public abstract Roshambo generateRoshambo();
	}