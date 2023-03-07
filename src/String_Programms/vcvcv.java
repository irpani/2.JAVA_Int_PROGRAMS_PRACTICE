package String_Programms;

public class vcvcv {

	public static void main(String[] args) {

		String str1 = "Hellow";
		String str2 = "java";

		str1 = str1 + str2;
		str2 = str1.substring(0, 5);
		str1 = str1.substring(6);

		System.out.println(str1);
		System.out.println(str2);
	}

}