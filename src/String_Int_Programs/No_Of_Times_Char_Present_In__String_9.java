package String_Int_Programs;

import java.util.HashMap;

public class No_Of_Times_Char_Present_In__String_9 {

	public static void main(String[] args) {
		// String str = "shiakirpani";
		String str = "aaabbbxxzaaaazhaaaa";
		char ch[] = str.toCharArray();
		HashMap<Character, Integer> hp = new HashMap<Character, Integer>();

		for (int i = 0; i < ch.length; i++) {

			if (hp.containsKey(ch[i])) {
				int count = hp.get(ch[i]);
				hp.put(ch[i], count + 1);
			}

			else {
				hp.put(ch[i], 1);

			}

		}
		System.out.println(hp);
	}

}
