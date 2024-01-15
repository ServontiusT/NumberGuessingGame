package org.servontiusturner;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Print out the Random Number for testing
        // System.out.println(chosenNumber);

        System.out.print("What is your name: ");
        String userName = scanner.nextLine();

        String prompt = "\nI am thinking of a number between 1 and 100. Can you guess it? \nPlease choose a number between 1 and 100: ";
        System.out.print("Hi " + userName + "!" + prompt );
        int userNumber = Integer.parseInt(scanner.nextLine());

        numberGuesser(userName, userNumber, scanner);
    }

    public static void numberGuesser(String name, int userGuess, Scanner scanner) {
        Random randomNumber = new Random();

        //Choose a random number between 1 and 101 not including 101
        int chosenNumber = randomNumber.nextInt(1, 101);
        int guessCount = 0;

        while (userGuess != chosenNumber) {
            if (userGuess > chosenNumber) {
                System.out.print("Too high. Guess again: ");
            } else {
                System.out.print("Too low. Guess again: ");
            }
            userGuess = Integer.parseInt(scanner.nextLine());
            guessCount ++;
        }
        guessCount++;
        System.out.println("Congratulations " + name + "! You guessed my number! It was " + chosenNumber);
        System.out.println("It took " + guessCount + " guesses!");
    }
}