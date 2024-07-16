package org.servontiusturner;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Print out the Random Number for testing
		// System.out.println(chosenNumber);
		NumberGuesser guessingGame = new NumberGuesser();
		String playAgain;

		System.out.print("What is your name: ");
		guessingGame.setPlayerName(scanner.nextLine());
		guessingGame.greetUser();

		do {
			guessingGame.setPlayerGuess(Integer.parseInt(scanner.nextLine()));

			guessingGame.guessPlayerNumber(scanner);

			System.out.println("Try Again (y/n)?: ");
			playAgain = scanner.nextLine();

			
		} while (playAgain.equalsIgnoreCase("y"));
	}
}