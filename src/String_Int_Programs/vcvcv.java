package String_Int_Programs;

import java.util.ArrayList;
import java.util.List;

public class vcvcv {

	public static void listitems() {

		List<String> li = new ArrayList<String>();

		li.add("Apple");
		li.add("orange");
		li.add("banana");

		System.out.println(li);

		// toArray[]
		Object[] arr = li.toArray();

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);

		}

	}

	public static void main(String[] args) {

		listitems();
	}
}