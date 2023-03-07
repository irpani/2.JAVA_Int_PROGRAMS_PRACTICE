package RahulSetty_Programs;

import java.util.Scanner;

//1: Print all the numbers between -15 to 10.
public class Mul_Table {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the multiplication number : ");
		int table = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "*" + table + "=" + table * i);
		}
	}

}
