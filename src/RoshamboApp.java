import java.util.Scanner;

public class RoshamboApp extends RandPlayer{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Rock Paper Scissors!\n");
		//1. prompt user to enter name & opponent
		//2. get user input
		String name = Validator.getString(scan, "Enter name: ");
		int opponent = Validator.getInt(scan, "Choose Opponent: (1 -Rock, 2 -Random): ");
		
		HumanPlayer player = new HumanPlayer(name);
		RandPlayer random = new RandPlayer();
		RockPlayer rock = new RockPlayer();
		
		
		
		Roshambo randChoice = RandPlayer.generateRoshambo();
		if (opponent == 1) {
			RockPlayer RockPlayer = new RockPlayer();
		}else if (opponent == 2) {
			RandPlayer RandPlayer = new RandPlayer();
		}
		
		//3. prompt user for choice R,P,S
		
		
		int userChoice = Validator.getInt(scan, "Select 1. Rock, 2. Paper, or 3. Scissors: ");
		Roshambo rosh;

		if (userChoice == 1) {
			 rosh = Roshambo.ROCK;
		}else if (userChoice == 2) {
			 rosh = Roshambo.PAPER;
		}else if (userChoice == 3) {
			 rosh = Roshambo.SCISSORS;	
		}
		System.out.println("You chose " + userChoice);
		
		//if (opponent == 1) {
			//if (rosh == RockPlayer) {
				
			//}else if (rosh == )
		int userWins = 0;
		int compWins = 0;
		
		
	
	if (userChoice == (opponent)) {
		System.out.println("It's a Tie!!");
	} else if ((userChoice == (2)) && (opponent == (1))) {
		System.out.println("You Won!");
		userWins++;
	} else if ((userChoice == (3)) && (opponent == (1))) {
		System.out.println("Rock Won!");
		compWins++;
	
	}
	
	
	
	if (userChoice == ()) {
		System.out.println("It's a Tie!!");
	} else if ((userChoice == (1)) && (opponent == (2))) {
		System.out.println("You Won!");
		userWins++;
	} else if ((userChoice == (1)) && (opponent == (2))) {
		System.out.println("Random Won!");
		compWins++;
	
	}

	//4. display results
	System.out.println("User: " + userWins);
	System.out.println("Random: " + compWins);

		
	}
}
