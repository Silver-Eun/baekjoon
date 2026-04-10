package Bronze_II;

import java.util.Scanner;

public class ex03076 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int R = sc.nextInt();
		int C = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		for (int i = 0; i < R * A; i++) {
			for (int j = 0; j < C * B; j++) {

				int row = i / A;
				int col = j / B;

				if ((row + col) % 2 == 0) {
					System.out.print('X');
				} else {
					System.out.print('.');
				}
			}
			System.out.println();
		}

		sc.close();
	}

}
