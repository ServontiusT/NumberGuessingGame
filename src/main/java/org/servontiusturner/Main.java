package org.servontiusturner;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("What is your name: ");
		NumberGuesser guessingGame = new NumberGuesser(scanner.nextLine());
		
		guessingGame.greetUser();
		
		guessingGame.guessPlayerNumber();
		
		System.out.println("Thank you for playing!!");
		scanner.close();
	}
}