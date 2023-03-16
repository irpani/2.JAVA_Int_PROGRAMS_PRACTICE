package Sorting_Searhing;

public class LinearSearch_1 {

	public static boolean Lin_search(int[] arr) {
		int search = 5;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == search) {

				flag = true;
				System.out.println("Element is found...." + arr[i]);
				System.exit(0);
			} else {
				flag = false;
				System.out.println("Element not  found...");
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {
		int arr[] = { 5, 8, 45, 189, 96 };
		Lin_search(arr);

	}

}