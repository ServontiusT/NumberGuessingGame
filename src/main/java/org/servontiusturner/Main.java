package org.servontiusturner;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random randomNumber = new Random();

        //Choose a random number between 1 and 101 not including 101
        int chosenNumber = randomNumber.nextInt(1, 101);
        int guessCount = 0;

        // Print out the Random Number for testing
        // System.out.println(chosenNumber);

        System.out.print("What is your name: ");
        String userName = userInput.nextLine();

        String prompt = "\nI am thinking of a number between 1 and 100. Can you guess it? \nPlease choose a number between 1 and 100: ";
        System.out.print("Hi " + userName + "!" + prompt );
        int userNumber = Integer.parseInt(userInput.nextLine());

        while (userNumber != chosenNumber) {
            if (userNumber > chosenNumber) {
                System.out.print("Too high. Guess again: ");
            } else {
                System.out.print("Too low. Guess again: ");
            }
            userNumber = Integer.parseInt(userInput.nextLine());
            guessCount ++;
        }
        guessCount++;
        System.out.println("Congratulations! You guessed my number! It was " + chosenNumber);
        System.out.println("It took " + guessCount + " guesses!");
    }
}