package Gen_Programs;

class ArmStrong {
	public static void main(String[] args) {
		int temp, n = 153, c = 0, a;
		temp = n;

		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + a * a * a;
		}

		if (temp == c) {
			System.out.println("number is armstrongnumber " + c);
		} else {
			System.out.println("number is not an armstrongnumber");
		}
	}
}
