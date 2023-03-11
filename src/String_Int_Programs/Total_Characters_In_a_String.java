package String_Int_Programs;

public class Total_Characters_In_a_String {

	public static void main(String[] args) {

		String str = "Shaik Irpani";
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("No Of Characters in a String is ...." + count);
	}

}
