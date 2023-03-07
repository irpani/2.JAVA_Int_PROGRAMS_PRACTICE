package String_Programms;

public class CheckRotation {

	public static void main(String[] args) {

		String str1 = "ABCD";
		String str2 = "CDAB";

		if (str1.length() != str2.length()) {
			System.out.println("Not a Rotation");
			System.exit(0);
		}

		String join = str1 + str1;

		if (join.indexOf(str2) != -1)
			System.out.println("Rotation");
		else
			System.out.println("Not a Rotation");
	}
}