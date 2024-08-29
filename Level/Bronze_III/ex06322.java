package Bronze_III;

import java.util.Scanner;

public class ex06322 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 1;

		while (true) {
			String[] A = sc.nextLine().split(" ");

			double a = Double.parseDouble(A[0]);
			double b = Double.parseDouble(A[1]);
			double c = Double.parseDouble(A[2]);

			if (a == 0 && b == 0 && c == 0)
				break;

			System.out.println("Triangle #" + i);

			if (a == -1) {
				if (c <= b) {
					System.out.println("Impossible.");
				} else {
					a = Math.sqrt((c * c) - (b * b));
					System.out.printf("a = " + "%.3f", a);
					System.out.println();
				}
			}
			if (b == -1) {
				if (c <= a) {
					System.out.println("Impossible.");
				} else {
					b = Math.sqrt((c * c) - (a * a));
					System.out.printf("b = " + "%.3f", b);
					System.out.println();
				}
			}
			if (c == -1) {
				c = Math.sqrt((a * a) + (b * b));
				System.out.printf("c = " + "%.3f", c);
				System.out.println();
			}

			i++;
			System.out.println();
		}

		sc.close();
	}

}
