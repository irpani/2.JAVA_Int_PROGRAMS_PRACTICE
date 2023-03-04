package String_Int_Programs;

public class Sentence_Reverse_3 {

	public static void main(String[] args) {

		String str = "I love you";
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Enter a Sentence"); input = scanner.nextLine();
		 */
		String[] words = str.split(" ");
		// Now, Print the sentence in reverse order
		System.out.println("Reversed Sentence");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
	}
}
