package Gen_Programs;

public class FizzBuzz {

	// _____ Ukraine Guys asked this Question_____

	/*
	 * FizzBuzz is a game that is popular among kids. By playing this, kids learn
	 * the division. Now, the FizzBuzz game has become a popular programming
	 * question that is frequently asked in Java programming interviews. In this
	 * section, we will learn how to create a FizzBuzz program in Java.
	 */

	public static void main(String args[]) {
		int n = 35;

		for (int i = 1; i <= n; i++) {
			// returns true if both the conditions return true
			if (i % 5 == 0 && i % 7 == 0) {
				// prints if the number is multiple of 3 and 5
				System.out.print("FizzBuzz");
			}
			// executes if the condition returns true
			else if (i % 5 == 0) {
				// prints if the number is multiple of 3
				System.out.print("Fizz");
			}
			// executes if the condition returns true
			else if (i % 7 == 0) {
				// prints if the number is multiple of 5
				System.out.print("Buzz");
			} else {
				// prints the number itself if the number is not divisible by both 3 and 5
				System.out.print(i);
			}
			// prints space
			System.out.print("," + " ");
		}

	}
}
