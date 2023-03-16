package Gen_Programs;

import java.util.Random;

public class RandomNumbers_4 {

	public static void main(String[] args) {

		/*
		 * // Generating random numbers System.out.println("1st Random Number: " +
		 * Math.random());// 0.8752100471827655 System.out.println("2nd Random Number: "
		 * + Math.random());// 0.7807828305551182
		 * System.out.println("3rd Random Number: " + Math.random());//
		 * 0.30239346401623113 System.out.println("4th Random Number: " +
		 * Math.random());// 0.5398511688002571
		 */
		Random r = new Random();
		int num = r.nextInt(10);
		System.out.println(num);
	}

}
