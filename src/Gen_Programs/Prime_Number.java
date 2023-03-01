package Gen_Programs;

public class Prime_Number {

	public static void main(String[] args) {
		// Logic :Number Divisible By 2 & Itself
		int n = 11;
		boolean prime = true;

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				prime = false;
			}
		}
		System.out.println("Is it Prime???:  " + prime);

	}
}