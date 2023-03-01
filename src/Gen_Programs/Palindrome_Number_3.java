package Gen_Programs;

public class Palindrome_Number_3 {
	// % means ---> Remainder 2
	// / means ---> Quotient
	public static void main(String[] args) {

		int n = 121;
		int rev = 0;
		int temp = n;
		while (n != 0) {

			rev = rev * 10 + n % 10;
			n = n / 10;
		}

		if (temp == rev) {
			System.out.println("Entered Number is Palindrome" + rev);
		} else {
			System.out.println("Number is Not Palindrome" + rev);

		}

	}

}
