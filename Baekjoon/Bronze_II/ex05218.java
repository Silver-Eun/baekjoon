package Bronze_II;

import java.util.Scanner;

public class ex05218 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String A = sc.next();
			String B = sc.next();

			System.out.print("Distances: ");

			for (int j = 0; j < A.length(); j++) {
				int a = A.charAt(j) - 'A';
				int b = B.charAt(j) - 'A';

				if (b >= a)
					System.out.print((b - a) + " ");
				else
					System.out.print((b + 26 - a) + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
