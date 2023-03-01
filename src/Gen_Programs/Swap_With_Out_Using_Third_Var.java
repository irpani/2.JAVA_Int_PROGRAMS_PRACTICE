package Gen_Programs;

public class Swap_With_Out_Using_Third_Var {

	public static void main(String[] args) {
		int x = 25, y = 23;
		System.out.println("Before Swapping x Value" + x);
		System.out.println("Before Swapping y Value" + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swapping" + "X value is:" + x);
		System.out.println("After Swapping" + "Y value is " + y);

	}

}
