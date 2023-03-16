package Sorting_Searhing;

public class BinarySearch_2 {

	public static void binarySearch(int a[]) {
		int li = 0, hi = a.length - 1, target = 30;
		int mid = (li + hi) / 2;

		while (li <= hi) {
			mid = (li + hi) / 2;
			if (a[mid] < target) {
				li = mid + 1;
			} else if (a[mid] == target) {
				System.out.println("Element is found at index: " + mid);
				break;
			} else {
				hi = mid - 1;
			}
			// mid = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println("Element is not found!");
		}
	}

	public static void main(String args[]) {
		int a[] = { 10, 20, 30, 40, 50 };

		binarySearch(a);
	}
}