package Array_Programms;

public class StringArray_Duplicates_3 {

	public static void main(String[] args) {
		String[] str = { "java", "python", "c++", "java" };

		for (int i = 0; i < str.length; i++) {

			for (int j = i + 1; j < str.length; j++) {

				if (str[i] == str[j]) {
					System.out.println("Duplicate elements in Array:... " + str[i]);
				}

			}

		}

	}

}
