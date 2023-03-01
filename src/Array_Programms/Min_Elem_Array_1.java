package Array_Programms;

public class Min_Elem_Array_1 {

	public static void main(String[] args) {

		int a[] = { 11, 67, 23, 0, 55, 91, 1, 5, -1 };
		int min = a[0];
		for (int i = 0; i < a.length; i++) {

			if (a[i] < min) {
				min = a[i];
			}

		}
		System.out.println("Miniumum Elem in Array is :" + min);
	}

}

// O/p:-1
