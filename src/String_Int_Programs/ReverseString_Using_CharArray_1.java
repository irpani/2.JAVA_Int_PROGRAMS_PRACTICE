package String_Int_Programs;

public class ReverseString_Using_CharArray_1 {

	public static void main(String[] args) {

		String s = "INDIA";

		char ch[] = s.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

	}

}
