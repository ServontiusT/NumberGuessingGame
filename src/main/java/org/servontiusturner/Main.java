package org.servontiusturner;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numberOfGuesses;
		int cpuNumber;
		String playAgain;

		NumberGuesser guessingGame = new NumberGuesser();

		System.out.print("What is your name: ");
		guessingGame.setPlayerName(scanner.nextLine());
		guessingGame.greetUser();

		do {
			System.out.println("\n \nI am thinking of a number between 1 and 100. Can you guess it? \n \nPlease choose a number between 1 and 100: ");
			int playerGuess = Integer.parseInt(scanner.next());
			guessingGame.setPlayerGuess(playerGuess);

			guessingGame.guessPlayerNumber();
			numberOfGuesses = guessingGame.getGuessCount();
			cpuNumber = guessingGame.getCpuNumber();

			System.out.println("Congratulations " + guessingGame.getPlayerName() + "! You guessed my number! It was " + cpuNumber);
			System.out.println("It took " + numberOfGuesses + " guesses!");

			System.out.println("Try Again (y/n)?: ");
			playAgain = scanner.nextLine();			
		} while (playAgain.equalsIgnoreCase("y"));
		
		scanner.close();
	}
}