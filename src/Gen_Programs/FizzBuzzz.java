package Gen_Programs;

public class FizzBuzzz {

	public static void main(String[] args) {
		int numbers = 0;
		for (numbers = 1; numbers <= 100; numbers++) {
			if (numbers % 3 == 0 && numbers % 5 == 0) {
				System.out.println("Fizz Buzz");
			} else if (numbers % 3 == 0) {
				System.out.println("Fizz");
			} else if (numbers % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(numbers);
			}

		}
	}

}