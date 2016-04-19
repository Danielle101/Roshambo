package roshamboGame;

public enum Roshambo {
	
	ROCK, PAPER, SCISSORS;
	  
	@Override
	public String toString(){
	if (this.ordinal() == 0) return "Rock";
	if (this.ordinal() == 1) return "Paper";
	if (this.ordinal() == 2) return "Scissors";
	return "";   
	}
	}

