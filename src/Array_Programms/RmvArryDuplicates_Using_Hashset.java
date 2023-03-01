package Array_Programms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RmvArryDuplicates_Using_Hashset {

	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(54);
		list.add(6);
		list.add(79);
		list.add(6);
		list.add(8);
		list.add(54);
		System.out.println("Before List : " + list);

		Set<Integer> set = new HashSet<Integer>(list);
		list.clear();
		list.addAll(set);
		System.out.println("After List : " + list);

	}
}