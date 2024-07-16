package org.servontiusturner;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
	private static String playerName;
	private int guess;
	
	public NumberGuesser() {}

	public void setPlayerName(String playerName) {
		NumberGuesser.playerName = playerName;
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
         System.out.print("Hi " + playerName + "!" + "\n \nI am thinking of a number between 1 and 100. Can you guess it? \n \nPlease choose a number between 1 and 100: " );
	}
	
	public void guessPlayerNumber(Scanner scanner) {
        Random randomNumber = new Random();

        //Choose a random number between 1 and 101 not including 101
        int cpuNumber = randomNumber.nextInt(1, 101);
        int guessCount = 0;
        int currentUserGuess = guess;

        while (currentUserGuess != cpuNumber) {
            if (currentUserGuess > cpuNumber) {
                System.out.print("Too high. Guess again: ");
            } else {
                System.out.print("Too low. Guess again: ");
            }
            currentUserGuess = Integer.parseInt(scanner.nextLine());
            guessCount ++;
        }
        
        guessCount++;
        
        System.out.println("Congratulations " + playerName + "! You guessed my number! It was " + cpuNumber);
        System.out.println("It took " + guessCount + " guesses!");
    }
}