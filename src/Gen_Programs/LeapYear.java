package Gen_Programs;

import java.util.Scanner;

public class LeapYear {

	public static boolean yyear(int year) {
		if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt(); // 1994

		if (yyear(year) == true) {
			System.out.println("Yes ");
		} else {
			System.out.println("No ");
		}
	}
}