package day4;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		
	System.out.println("Welcome to the Game");
	
	// User input
	
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Enter your choice:");
	System.out.println("0: Rock, 1: Paper, 2: Scissors");
	
	int UserChoice = scanner.nextInt();
	
	//System.out.println(UserChoice);
	
	// Validate User Choice
	
	if (UserChoice < 0 || UserChoice > 2)
	{
		System.out.println("Invalid choice. Run the program again and enter 0, 1, 2.");
		return;
	}

	//Generate computer choice
	
	int ComputerChoice = new Random().nextInt(3);
	System.out.println("Computer Chooses: "+ComputerChoice);
	
	//Determine the winner
	
	if (UserChoice == ComputerChoice)
	{
		System.out.println("Its a Tie.");
	}
	
	//User to win
	
	else if ((UserChoice == 0 && ComputerChoice == 2) ||
			 (UserChoice == 1 && ComputerChoice == 0) ||
			 (UserChoice == 2 && ComputerChoice == 1))
	{
		System.out.println("Congratulation! You Wins");
	}
	
	else
	{
		System.out.println("Computer Wins.");
	}
	
	scanner.close();
		
	}

}
