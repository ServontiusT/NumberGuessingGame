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

	public void setCpuNumber(int cpuNumber) {
		this.cpuNumber = cpuNumber;
	}

	public int getGuessCount() {
		return guessCount;
	}

	public void setGuessCount(int guessCount) {
		this.guessCount = guessCount;
	}

	public NumberGuesser() {}

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
		System.out.print("Hi " + playerName + "!");
	}

	public void guessPlayerNumber() {
		Random randomNumber = new Random();
		Scanner scanner = new Scanner(System.in);
		
		//Choose a random number between 1 and 101 not including 101
		int cpuNumber = randomNumber.nextInt(1, 101);
		int guessCount = 0;
		int currentUserGuess = this.guess;

		while (currentUserGuess != cpuNumber) {
			if (currentUserGuess > cpuNumber) {
				System.out.print(currentUserGuess + " Is too high. Guess again: ");
			} else {
				System.out.print(currentUserGuess + " Is too low. Guess again: ");
			}
			currentUserGuess = Integer.parseInt(scanner.nextLine());
			guessCount ++;
		}

		guessCount++;

		setPlayerGuess(currentUserGuess);
		setGuessCount(guessCount);
		setCpuNumber(cpuNumber);
		scanner.close();
	}
}