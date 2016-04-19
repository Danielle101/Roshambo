package roshamboGame;
import java.util.*;
			public class RoshamboApp
			{
			public static void main(String args[])
			{
			Scanner scan=new Scanner(System.in);   
			String choice="y";
			char player;
			Player p = null; 
			
			String name;

			//objects for RandomPlayer and RockPlayer
			RockPlayer jets =new RockPlayer();
			RandomPlayer sharks =new RandomPlayer();
			System.out.println("Welcome to Rock Paper Scissors!\n");
			  
			// get the users name
			name = Validator.get_String("Enter your name : ");

			String playerChoice = Validator.get_String("Would you like to play against the Jets or the Sharks?(J/S): ");

			
			player = playerChoice.charAt(0);

			//either RockPlayer 
			if(player=='j' || player == 'J') p=jets;
			  
			//or RandomPlayer
			else if(player=='s' || player == 'S') p=sharks;
			  
			p.setName(playerChoice);
			  
		
			while(choice.compareTo("y") == 0){
			System.out.print("Rock, paper or scissors?(R/P/S) : ");
			String rps = scan.next();
			HumanPlayer p1=new HumanPlayer();
			p1.setName(name);
			p1.setResponse(rps);
			System.out.println(name+ " : " + rps);
			System.out.println(p.getName()+ " : " + p.generateRoshambo());
			if(Character.toUpperCase(rps.charAt(0)) == p.generateRoshambo().toString().charAt(0))
			System.out.println("Draw!");
			else if(p1.generateRoshambo()== Roshambo.PAPER && p.generateRoshambo()==Roshambo.ROCK)
			System.out.println(p1.getName()+" Wins");
			else if(p1.generateRoshambo() == Roshambo.PAPER && p.generateRoshambo()==Roshambo.SCISSORS)
			System.out.println(p.getName()+" Wins!");
			else if(p1.generateRoshambo()==Roshambo.SCISSORS && p.generateRoshambo()==Roshambo.ROCK)
			System.out.println(p.getName()+" Wins");

			// see if the user wants to continue
			choice = Validator.getString("Play again?(y/n): ");
			System.out.println();
			}
			}
			}