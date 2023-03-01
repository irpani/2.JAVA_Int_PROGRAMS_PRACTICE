package String_Int_Programs;

//vvv ....imp Questions 
public class CountTheNoOfVowelsAndConsonantsInAString_11 {

	public static void main(String[] args) {

		// Number Of Consonants in A String
		int count = 0;
		String str = "India is One Of the Best Country in the World";

		for (int i = 0; i < str.length() - 1; i++) {
			if (!(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u')) {
				count++;
			}
		}
		System.out.println("Number Of Consontats Of a  in a String is:" + count);

		// Number Of Vowels in A String
		int count1 = 0;
		String str1 = "India is One Of the Best Country in the World";

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count1++;
			}
		}
		System.out.println("Number Of vowels Of a  in a String is:" + count1);

	}

}
