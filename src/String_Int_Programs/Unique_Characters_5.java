package String_Int_Programs;

public class Unique_Characters_5 {

	public static void uniqueCharacters(String test) {
		String str = "";
		for (int i = 0; i < test.length(); i++) {
			char ch = test.charAt(i);
			if (str.indexOf(ch) == -1) {
				str = str + ch;
			} else {
				str.replace(String.valueOf(ch), ""); // added this to your existing code
			}
		}

		System.out.println(str + " ");

	}

	public static void main(String[] args) {
		uniqueCharacters("welcome to the world");

	}

}
