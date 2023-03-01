package Gen_Programs;

public class Factorial_Number {

	// Factorial Of a Number is :
	// 5! =5*4*3*2*1=120
	// 4! =4*3*2*1
	// 3!=3*2*1
	// 2!=2*1
	// 1!=1

	public static void main(String[] args) {

		int f = 1;
		for (int i = 1; i <= 5; i++) {
			f = f * i;
		}
		System.out.println("factorial of a number" + f);
	}

}
