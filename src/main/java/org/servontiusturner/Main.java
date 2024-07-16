package org.servontiusturner;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//String playAgain;

		NumberGuesser guessingGame = new NumberGuesser();

		System.out.print("What is your name: ");
		guessingGame.setPlayerName(scanner.nextLine());
		guessingGame.greetUser();
		
		guessingGame.guessPlayerNumber();
		
		scanner.close();
	}
}