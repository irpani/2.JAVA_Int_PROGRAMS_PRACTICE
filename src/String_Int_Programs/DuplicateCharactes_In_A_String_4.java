package String_Int_Programs;

public class DuplicateCharactes_In_A_String_4 {

	public static void main(String argu[]) {
		String str = "welcome to the world";
		char[] ch = str.toCharArray();
		System.out.println("The string is: " + str);
		System.out.print("Duplicate Characters in above string are: ");
		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.print(ch[j] + " ");
					break;
				}
			}
		}
	}

}

// Duplicate Characters in above string are: w e l o e t o