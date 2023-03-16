package Array_Programms;

import java.util.Arrays;

public class SecondLargest_In_Array {

	public static void main(String args[]) {
		int a[] = { 10, 20, 25, 63, 96, 57 };
		int size = a.length;
		Arrays.sort(a);
		System.out.println();
		System.out.println("sorted Array ::" + Arrays.toString(a));
		int res = a[size - 2];
		System.out.println("2nd largest element is ::" + res);
	}

}