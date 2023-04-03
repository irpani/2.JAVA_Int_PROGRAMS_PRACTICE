package String_Int_Programs;

public class Split_Alp_Num_Chars {

	public static void splitnum(String str) {

		StringBuffer alp = new StringBuffer(), num = new StringBuffer(), spec = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {

				alp.append(str.charAt(i));

			} else if (Character.isDigit(str.charAt(i))) {
				num.append(str.charAt(i));

			}

			else {
				spec.append(str.charAt(i));

			}

		}
		System.out.println(alp);
		System.out.println(num);
		System.out.println(spec);
	}

	public static void main(String[] args) {
		Split_Alp_Num_Chars obj = new Split_Alp_Num_Chars();
		splitnum("geeks01for02geeks03!!!");

	}

}
