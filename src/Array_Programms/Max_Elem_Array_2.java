package Array_Programms;

public class Max_Elem_Array_2 {

	public static void main(String[] args) {

		int a[] = { 11, 67, 23, 0, 55, 91, 1, 5 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];
			}

		}
		System.out.println(max);
	}

}

// O/p :91
