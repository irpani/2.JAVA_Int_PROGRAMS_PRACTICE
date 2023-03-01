package String_Int_Programs;

public class No_Of_Words_In_A_string_6 {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		// String s = sc.nextLine();
		String s = "WELCOME TO JAVA WORLD";
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {

			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {

				count++;
			}

		}

		System.out.println("Number of words in a String are :" + count);
	}

}
