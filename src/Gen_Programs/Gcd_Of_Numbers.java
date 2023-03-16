package Gen_Programs;

public class Gcd_Of_Numbers {
	public static void main(String args[]) {
		int num1 = 3, num2 = 6;
		int gcd = 1;
		for (int i = 1; i <= Math.min(num1, num2); i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		System.out.print("The GCD of the two number is " + gcd);
	}
}