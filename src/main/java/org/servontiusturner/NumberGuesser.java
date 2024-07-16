package org.servontiusturner;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
	private String playerName;
	private int guess;
	private int guessCount;
	private int cpuNumber;

	public int getCpuNumber() {
		return cpuNumber;
	}

	public void setCpuNumber() {
		Random randomNumber = new Random();
		// Choose a random number between 1 and 101 not including 101
		this.cpuNumber = randomNumber.nextInt(1, 101);
	}

	public int getGuessCount() {
		return guessCount;
	}

	public void setGuessCount(int guessCount) {
		this.guessCount = guessCount;
	}

	public NumberGuesser(String playerName) {
		this.playerName = playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerGuess(int playerGuess) {
		this.guess = playerGuess;
	}

	public int getPlayerGuess() {
		return guess;
	}

	@Override
	public String toString() {
		return "NumberGuesser [playerName=" + playerName + ", guess=" + guess + "]";
	}

	public void greetUser() {
		System.out.print("Hi " + playerName + "! \n\nI am thinking of a number between 1 and 100. Can you guess it?");
	}

	public void guessPlayerNumber() {
		Scanner scanner = new Scanner(System.in);
		String playAgain;

		do {
			int guessCount = 0;
			setCpuNumber();

			System.out.println("\n \nPlease choose a number between 1 and 100: ");
			setPlayerGuess(Integer.parseInt(scanner.next()));

			while (guess != cpuNumber) {
				if (guess > cpuNumber) {
					System.out.print(guess + " Is too high. Guess again: ");
				} else {
					System.out.print(guess + " Is too low. Guess again: ");
				}

				this.guess = Integer.parseInt(scanner.next());
				guessCount++;
			}
			guessCount++;

			System.out.println("\nCONGRATULATIONS " + playerName + "! You guessed my number! It was " + cpuNumber);
			System.out.println("It took " + guessCount + " guesses!");

			System.out.println("Try Again (y/n)?: ");
			playAgain = scanner.next();
		} while (playAgain.equalsIgnoreCase("y"));

		scanner.close();
	}
}