package Gen_Programs;

public class Swap_With_Out_Using_Third_Var {

	public static void main(String[] args) {

		int x = 10, y = 20;
		System.out.println("Before swap x value is " + x);
		System.out.println("Before swap y value is " + y);
		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("After swap x value is " + x);
		System.out.println("After swap y value is " + y);
	}

}