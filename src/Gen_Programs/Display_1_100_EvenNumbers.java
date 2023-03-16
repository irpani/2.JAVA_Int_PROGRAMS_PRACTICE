package Gen_Programs;

public class Display_1_100_EvenNumbers {

	public static void main(String[] args) {

		int num = 100;
		for (int i = 1; i <= num; i++) {

			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

	}

}
