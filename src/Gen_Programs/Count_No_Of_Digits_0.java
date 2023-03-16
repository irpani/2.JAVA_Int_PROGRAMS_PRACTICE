package Gen_Programs;

public class Count_No_Of_Digits_0 {

	public static void main(String[] args) {

		int num = 12345, sum = 0;
		int count = 0;

		while (num != 0) {
			// sum = sum + num % 10;

			num = num / 10;

			count = count + 1;
		}

		System.out.println("Number Of Digits in a Number...:" + count);

	}

}
