package Sorting_Searhing;

public class Insertion_Sort_4 {

	public static void insertionSort(int a[]) {
		int n = a.length;
		for (int j = 1; j < n; j++) {
			int temp = a[j];
			int i = j - 1;
			while ((i > -1) && (a[i] > temp)) {
				a[i + 1] = a[i];
				i--;
			}
			a[i + 1] = temp;
		}
	}

	public static void main(String a[]) {
		int[] arr = { 9, 14, 3, 2, 43, 11, 58, 22 };
		System.out.println("Before Insertion Sort");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		insertionSort(arr);// sorting array using insertion sort

		System.out.println("After Insertion Sort");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}