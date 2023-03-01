package Array_Programms;

import java.util.Arrays;

public class Sort_Elem_In_Array_4 {

	public static void main(String[] args) {

		// Case(1):
		/*
		 * int[] a = { 93, 12, 1, 33, 78, 23 };
		 * 
		 * System.out.println("Before Sort..." + Arrays.toString(a));
		 * 
		 * Arrays.sort(a); System.out.println("After Sort" + Arrays.toString(a));
		 */
		// Case(2):
		// -------------
		/*
		 * int[] a = { 93, 12, 1, 33, 78, 23 };
		 * 
		 * System.out.println("Before Sort..." + Arrays.toString(a));
		 * 
		 * Arrays.parallelSort(a); System.out.println("After Sort" +
		 * Arrays.toString(a));
		 */

		// Case(3):

		int[] a = { 93, 12, 1, 33, 78, 23 };

		System.out.println("Before Sort..." + Arrays.toString(a));
		// Arrays.sort(a,Collections.reverseOrder());

		System.out.println("After Sort" + Arrays.toString(a));

	}

}
