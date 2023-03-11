package Sorting_Searhing;

import java.util.Arrays;

public class Insertion_Sort_4 {

	public static void main(String[] args) {
		// declare an array and print the original contents
		int[] a = { 10, 6, 15, 4, 1, 45 };
		System.out.println("Original Array:" + Arrays.toString(a));
		// apply insertion sort algorithm on the array
		for (int i = 1; i < a.length - 1; i++) {
			int temp = a[i];
			int j = i - 1;
			while (j >= 0 && temp <= a[j]) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = temp;
		}
		// print the sorted array
		System.out.println("Sorted Array:" + Arrays.toString(a));
	}
}