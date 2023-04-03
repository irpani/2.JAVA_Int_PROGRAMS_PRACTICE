package Gen_Programs;

import java.util.Scanner;

public class ForLoopChallenges {

	public static void main(String[] args) {
		printDonutsLove();
		ascendingToDescending();
		multiplesOfFive();
		sumOfMultiples();
		sumNumbersInRange();
		drawRectangleAsterisks();
		printUsingTens();

	}

	private static void printDonutsLove() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I love doughnuts!");
		}
	}

	private static void ascendingToDescending() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Ascending: " + i);
		}
		for (int i = 5; i >= 1; i--) {
			System.out.println("Descending: " + i);
		}
	}

	public static void multiplesOfFive() {
		for (int i = 5; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}

	}

	public static void sumOfMultiples() {

		int sum = 0;

		for (int i = 5; i <= 100; i += 5) {
			sum += i;
		}
		System.out.println("The sum is: " + sum);

	}

	private static void sumNumbersInRange() {
		System.out.println("Enter your lowerbound: ");
		Scanner userInput = new Scanner(System.in);
		int lowerBound = userInput.nextInt();

		System.out.println("Enter your upperbound: ");
		int upperBound = userInput.nextInt();

		for (int i = lowerBound; i <= upperBound; i++) {
			System.out.println(i);
		}
		int sum = 0;

		for (int i = lowerBound; i <= upperBound; i++) {
			sum += i;
		}
		System.out.println("Your sum is: " + sum);
	}

	private static void drawRectangleAsterisks() {

		System.out.println("*********");

		for (int i = 1; i <= 9; i++) {
			System.out.println("*" + "       " + "*");
		}

		System.out.println("*********");
	}

	private static void printUsingTens() {
		for (int i = 9 + 1; i <= 101 - 1; i++) {

			if (i % (9 + 1) == 0) {
				System.out.println(i);
			}
		}

	}

}