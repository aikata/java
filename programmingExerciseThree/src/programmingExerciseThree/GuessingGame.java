package programmingExerciseThree;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

	static int guessCount = 0;

	static int numberToBeGuessed;

	static int userGuess = 0;

	static int higherRange = 1000;

	static int lowerRange = 1;

	public static void main(String args[]) {
		guessingGameStart();

	}

	static void guessingGameStart() {
		
		Random generator = new Random(System.currentTimeMillis());
		
		numberToBeGuessed = 1 + (int) (generator.nextDouble() * 999);
		
		System.out.println("I am thinking of a number from 1 to 1000" + " ... guess what it is ?");

		evaluateGuess();

		System.out.println("WINNER! You guessed the number with " + guessCount + " tries!");
	}

	static void evaluateGuess() {
		Scanner keyboard = new Scanner(System.in);
		while (userGuess != numberToBeGuessed) {
			userGuess = keyboard.nextInt();

			guessCount++;
			if (userGuess > numberToBeGuessed) {
				if (userGuess < higherRange) {
					higherRange = userGuess;
				}
				System.out.println("LOWER! Guess between " + lowerRange + " and " + higherRange);
			} else if (userGuess < numberToBeGuessed) {
				if (userGuess > lowerRange) {
					lowerRange = userGuess;
				}
				System.out.println("HIGHER! Guess between " + lowerRange + " and " + higherRange);
			}
		}
		keyboard.close();
	}
}