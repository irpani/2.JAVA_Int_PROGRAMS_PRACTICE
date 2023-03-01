package Gen_Programs;

public class Number_Or_Alphabet {
	public static void main(String[] args) {
		char c = 'a';

		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			System.out.println(c + " is an Alphabet");
		} else {
			System.out.println(c + " is not an Alphabet");
		}
	}
}