package String_Int_Programs;

public class RegularExpression_To_Find_Num_char_Special {

	public static boolean isAlpha(String s) {
		return s != null && s.matches("^[a-zA-Z]*$");
	}

	public static void main(String[] args) {
		// String s = "ABCD123&*"; //false
		String s = "ABCD123"; // True

		System.out.println("IsAlpha: " + isAlpha(s));
	}
}
