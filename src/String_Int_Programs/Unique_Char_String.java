package String_Int_Programs;

import java.util.HashSet;

public class Unique_Char_String {

	public static void main(String[] args) {
		// String str = "I LOVE MY INDIA";
		String str = "aaabbbcccddd";
		HashSet set = new HashSet();

		for (int i = 0; i < str.length() - 1; i++) {

			set.add(str.charAt(i));

		}

		System.out.println(set);
	}

}