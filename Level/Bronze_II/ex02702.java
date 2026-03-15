package Bronze_II;

import java.util.Scanner;

public class ex02702 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int x = a;
			int y = b;

			while (y != 0) {
				int temp = x % y;
				x = y;
				y = temp;
			}

			int gcd = x;
			int lcm = a * b / gcd;

			System.out.println(lcm + " " + gcd);
		}

		sc.close();
	}

}
