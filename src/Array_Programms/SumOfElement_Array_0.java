package Array_Programms;

public class SumOfElement_Array_0 {

	public static void main(String[] args) {

		int sum = 0;
		int a[] = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];
		}
		System.out.println(sum);
	}

}
