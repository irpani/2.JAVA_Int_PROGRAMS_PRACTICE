package Gen_Programs;

public class Greatest_Amon_Three {

	public static void main(String[] args) {
		int a = -1;
		int b = 0;
		int c = 1;

		if (a > b && a > c) {
			System.out.println("a is greater" + a);
		} else if (b > c) {
			System.out.println("b is greatest" + b);
		}

		else {

			System.out.println("C is gretest:" + " " + c);
		}
	}
}