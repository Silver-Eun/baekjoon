package Bronze_III;

import java.util.Scanner;

public class ex05361 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String[] A = sc.nextLine().split(" ");

			int a = Integer.parseInt(A[0]);
			int b = Integer.parseInt(A[1]);
			int c = Integer.parseInt(A[2]);
			int d = Integer.parseInt(A[3]);
			int e = Integer.parseInt(A[4]);

			double sum = (350.34 * a) + (230.90 * b) + (190.55 * c) + (125.30 * d) + (180.90 * e);

			System.out.printf("$" + "%.2f", sum);
			System.out.println();
		}
		
		sc.close();
	}

}
