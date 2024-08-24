package Bronze_III;

import java.util.Scanner;

public class ex05354 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();

			if (a == 1) {
				System.out.println("#");
			} else {
				for (int j = 0; j < a; j++) {
					System.out.print("#");
				}
				System.out.println();

				for (int b = 0; b < a - 2; b++) {
					System.out.print("#");
					for (int k = 0; k < a - 2; k++) {
						System.out.print("J");
					}
					System.out.println("#");
				}

				for (int j = 0; j < a; j++) {
					System.out.print("#");
				}
				System.out.println();
			}

			if (i < n - 1) {
				System.out.println();
			}
		}
		sc.close();
	}
}
