package String_Int_Programs;

public class StringBufferClass {

	public static void main(String[] args) {
		String str = "abc#$#23asc";
		char ch[] = str.toCharArray();
		StringBuffer num = new StringBuffer(), cha = new StringBuffer(), spe = new StringBuffer();

		for (int i = 0; i < ch.length; i++) {

			if (Character.isAlphabetic(ch[i])) {

				cha.append(ch[i]);

			}

			else if (Character.isDigit(ch[i])) {

				num.append(ch[i]);

			}

			else {
				spe.append(ch[i]);

			}

		}
		System.out.println("Chars :" + cha);
		System.out.println("SplChars :" + spe);
		System.out.println("Numerics" + num);
	}

}
