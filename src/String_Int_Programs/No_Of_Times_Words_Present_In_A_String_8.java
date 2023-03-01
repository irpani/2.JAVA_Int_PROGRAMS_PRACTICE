package String_Int_Programs;

import java.util.HashMap;

public class No_Of_Times_Words_Present_In_A_String_8 {

	public static void main(String[] args) {
		String str = "That that man man is one ";

		String[] wordsplit = str.split(" ");

		HashMap<String, Integer> Hmap = new HashMap<String, Integer>();

		for (int i = 0; i < wordsplit.length - 1; i++) {

			// Utilized HashMap 3 methods contains() ___ get() ___ put()
			if (Hmap.containsKey(wordsplit[i])) {
				int count = Hmap.get(wordsplit[i]);
				Hmap.put(wordsplit[i], count + 1);
			} else {
				Hmap.put(wordsplit[i], 1);
			}
		}
		System.out.println(Hmap);
	}
}