package RahulSetty_Programs;

import java.util.stream.Stream;

//2: Print HELLO in CAPITAL letters for the given string "ahceclwlxo"
public class PrintCapital {

	public static void main(String[] args) {

		String s = "ahceclwlxo";
		// Approach1
		String[] split = s.split("");
		for (int i = 1; i < split.length; i = i + 2) {
			System.out.print(split[i].toUpperCase());
		}
		System.out.println("\n----------");

		// Approach2
		Stream.iterate(1, i -> i + 2).map(n -> String.valueOf(s.charAt(n))).map(String::toUpperCase)
				.limit(s.length() / 2).forEach(System.out::print);
	}

}
