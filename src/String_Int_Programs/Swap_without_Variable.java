package String_Int_Programs;

public class Swap_without_Variable {

	public static void main(String[] args) {

		String str1 = "Hellow";
		String str2 = "java";

		str1 = str1 + str2;
		str2 = str1.substring(0, 5);
		str1 = str1.substring(6);

		System.out.println("After swap..." + str1);
		System.out.println("After swap..." + str2);
	}

}