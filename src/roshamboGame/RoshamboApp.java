package roshamboGame;

//this is a rock paper scissors game
import java.util.*;

public class RoshamboApp {
	public static void main(String args[])

	{
		int winCount = 0, loseCount = 0;
		Scanner scan = new Scanner(System.in);
		String choice = "y";
		char player;
		Player p = null;

		String name;

		// objects for RandomPlayer and RockPlayer
		RockPlayer j = new RockPlayer();
		RandomPlayer s = new RandomPlayer();
		System.out.println("Welcome to Rock Paper Scissors!\n");
		System.out.println("\nRULES:\nROCK beats SCISSORS\nPAPER beats ROCK\nSCISSORS beats PAPER\n"
				+ "2 like objects equals a draw (ie: PAPER vs PAPER)\n"); 

		// get the users name
		name = Validator.get_String("Enter your name : ");

		String playerChoice = Validator.getStringJS("Would you like to play against the Jets or the Sharks?(J/S): ");

		player = playerChoice.charAt(0);
		// pick jets
		if (player == 'j' || player == 'J')
			p = j;

		// or sharks
		else if (player == 's' || player == 'S')
			p = s;

		// set exact name The Jets for j|J, The Sharks for s|S
		if (playerChoice.charAt(0) == 'j' || playerChoice.charAt(0) == 'J')
			playerChoice = "The Jets";
		else if (playerChoice.charAt(0) == 's' || playerChoice.charAt(0) == 'S')
			playerChoice = "The Sharks";

		p.setName(playerChoice);

		while (choice.compareTo("y") == 0) {
			//System.out.print("Rock, paper or scissors?(R/P/S) : \n");
			String rps = Validator.getStringRPS("Rock, paper or scissors?(R/P/S): \n");
			HumanPlayer p1 = new HumanPlayer();
			p1.setName(name);
			p1.setResponse(rps);

			if (rps.charAt(0) == 'r' || rps.charAt(0) == 'R')
				rps = "Rock";
			else if (rps.charAt(0) == 'p' || rps.charAt(0) == 'P')
				rps = "Paper";
			else if (rps.charAt(0) == 's' || rps.charAt(0) == 'S')
				rps = "Scissors";

			System.out.println("\n"+name + " : " + rps);

			String roshambo = p.generateRoshambo().toString(); // generate
																// opponent's
																// roshambo
			System.out.println(p.getName() + " : " + roshambo);

			if (Character.toUpperCase(rps.charAt(0)) == roshambo.charAt(0))
			{	System.out.println("Draw!\n");
			
			}
			else if (rps.equals("Paper") && roshambo.equals("Rock")) {
				System.out.println(p1.getName() + " Wins\n");
				winCount++;
			}

			else if (roshambo.equals("Paper") && rps.equals("Rock")) {
				System.out.println(p.getName() + " Wins\n");
				loseCount++;
			}

			else if (rps.equals("Paper") && roshambo.equals("Scissors")) {
				System.out.println(p.getName() + " Wins!\n");
				loseCount++;
			}

			else if (roshambo.equals("Paper") && rps.equals("Scissors")) {
				System.out.println(p1.getName() + " Wins!\n");
				winCount++;
			}

			else if (rps.equals("Scissors") && roshambo.equals("Rock")) {
				System.out.println(p.getName() + " Wins\n");
				loseCount++;
			}

			else if (roshambo.equals("Scissors") && rps.equals("Rock")) {
				System.out.println(p1.getName() + " Wins\n");
				winCount++;
			}

			// ask if the user wants to continue playing
			System.out.println("Wins: " + winCount + " Losses: " + loseCount);
			choice = Validator.getString("Play again?(y/n): ");
			System.out.println();
		}
		System.out.println("Thanks for playing!");
		scan.close();
	}
}