package String_Int_Programs;

public class AHCECLWLXO {

	public static void main(String[] args) {
		String str = "ahceclwlxo";
		// Approach1
		String[] s = str.split("");
		for (int i = 1; i < s.length; i = i + 2) {
			System.out.print(s[i].toUpperCase());
		}
		System.out.println("\n----------------------------------------------------------");

		/*
		 * // Approach2 Stream.iterate(1, i -> i + 2). map(n
		 * ->String.valueOf(s.charAt(n))). map(String::toUpperCase).
		 * limit(s.length()/2). forEach(System.out::print);"
		 */

	}

}
