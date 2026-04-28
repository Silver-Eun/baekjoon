package Bronze_III;

import java.util.Scanner;

public class ex05217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int n = sc.nextInt();
			System.out.print("Pairs for " + n + ": ");
			boolean first = true;

			for (int a = 1; a < n; a++) {
				int b = n - a;

				if (a < b) {
					if (!first) {
						System.out.print(", ");
					}
					System.out.print(a + " " + b);
					first = false;
				}
			}
			System.out.println();
		}

		sc.close();
	}
}
