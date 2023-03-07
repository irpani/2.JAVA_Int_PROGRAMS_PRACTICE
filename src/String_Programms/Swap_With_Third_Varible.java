package String_Programms;

public class Swap_With_Third_Varible {

	public static void main(String[] args) {

		String str1 = "shaik";
		String str2 = "irfan";
		String temp = "";

		temp = str1;
		str1 = str2;
		str2 = temp;
		System.out.println("After swap...." + str1);
		System.out.println("After swap..." + str2);
	}
}