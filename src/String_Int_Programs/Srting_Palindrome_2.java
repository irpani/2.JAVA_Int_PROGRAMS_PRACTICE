package String_Int_Programs;

public class Srting_Palindrome_2 {

	public static void main(String[] args) {

		String str = "INI";
		String rev = "";
		char ch[] = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {

			rev = rev + ch[i];

		}

		if (rev.equals(str)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}

	}

}
