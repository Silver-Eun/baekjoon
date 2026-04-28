package Bronze_III;

import java.util.Scanner;

public class ex02712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < T; i++) {
			String[] A = sc.nextLine().split(" ");

			float a = Float.parseFloat(A[0]);
			String b = A[1];

			if (b.equals("kg")) {
				a *= 2.2046;
				b = "lb";
			} else if (b.equals("lb")) {
				a *= 0.4536;
				b = "kg";
			} else if (b.equals("l")) {
				a *= 0.2642;
				b = "g";
			} else if (b.equals("g")) {
				a *= 3.7854;
				b = "l";
			}

			System.out.printf("%.4f %s%n", a, b);
		}
		sc.close();
	}

}
