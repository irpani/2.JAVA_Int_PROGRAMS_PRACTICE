package Gen_Programs;

public class Reverse_A_Number_2 {

	public static void main(String[] args) {
		// int n = 1234;
		// ner sc = new Scanner(System.in);
		// System.out.println("Enter a Number:");

		// int num = sc.nextInt();
		int n = 1234;
		int rev = 0;
		while (n != 0) {
			rev = rev * 10 + n % 10;
			n = n / 10;

		}
		System.out.println("Reerse Of a Number is: " + rev);

	}

}
