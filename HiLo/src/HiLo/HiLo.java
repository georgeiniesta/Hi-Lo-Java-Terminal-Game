package HiLo;

import java.util.Scanner;
public class HiLo {

	public static void main(String[] args) {
		//Asking for a number to play with
		Scanner scan = new Scanner(System.in);
		String playAgain = "";

		do {
			//Creating number to guess
			int theNumber = (int)(Math.random()*100+1);
			//System.out.println(theNumber);

			int guess = 0;
			int turns = 0;
			//System.out.println("Your turn is: " + turns);
			//loop to check if the value is the same as generated one
			while (guess != theNumber) {
				System.out.println("Guess a number between 1 and 100: ");
				turns = turns +1;
				guess = scan.nextInt();
				if (guess < theNumber)
					System.out.println("You entered " + guess +", it's too low, try again.");
				else if (guess > theNumber) 
					System.out.println("You entered " + guess + ",it's too high, try again.");
				else 
					System.out.println("You win!");
			}
			System.out.println("Would you like to play again? (y/n)");
			System.out.println("You needed " + turns + " turns, Congratulations!");
			playAgain = scan.next();
		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("Thanks for playing! Goodbye!");
		scan.close();
	}
}