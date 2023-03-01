package Array_Programms;

public class Print_Duplicates_In_Array {

	public static void main(String[] args) {
		// int max=0;
		int[] a = { 9, 45, 1, 32, 9, 25, 34, 45, 23, 94, 100, 42, 120, 1, 32 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					System.out.println("Dupicate Numbers in the Array are:..." + a[i]);

				}

			}

		}

	}

}
