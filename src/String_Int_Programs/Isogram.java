package String_Int_Programs;

import java.util.Arrays;

//Given a string S of lowercase aplhabets, check if it is isogram or not. 
//An Isogram is a string in which no letter occurs more than once.

public class Isogram {

	public static boolean isIso(String str) {
		str = str.toLowerCase();
		int len = str.length();

		char arr[] = str.toCharArray();

		Arrays.sort(arr);
		for (int i = 0; i < len - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.println("No");
				break;

			} else {
				System.out.println("Yes It is Isogram");
				return true;
			}
		}
		return false;

	}

	public static void main(String args[]) {
		System.out.println(isIso("Machine"));

	}

}