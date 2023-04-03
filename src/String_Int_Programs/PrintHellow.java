package String_Int_Programs;

import java.util.stream.Stream;

//1: Print HELLO for the given string "AHCECLWLXO"
public class PrintHellow {
	public static void main(String[] args) {
		String s = "AHCECLWLXO";
		// Approach1
		String[] split = s.split("");
		for (int i = 1; i < split.length; i = i + 2) {
			System.out.print(split[i]);
		}

		// Approach2
		System.out.println("\n----");
		Stream.iterate(1, i -> i + 2).map(n -> s.charAt(n)).limit(s.length() / 2).forEach(System.out::print);

	}
}
