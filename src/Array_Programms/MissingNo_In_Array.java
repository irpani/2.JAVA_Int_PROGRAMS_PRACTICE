package Array_Programms;

public class MissingNo_In_Array {

	public static void main(String[] args) {
		int n = 5;
		// int a[] = { 1, 2, 4, 5 };
		int a[] = { 2, 4, 6, 5, 1 };
		int sumN = (n * (n + 1)) / 2;
		int sum = 0;
		/*
		 * for (int i = 0; i < n - 1; i++) { sum += array[i]; }
		 */

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		System.out.println(sumN - sum);
	}
}