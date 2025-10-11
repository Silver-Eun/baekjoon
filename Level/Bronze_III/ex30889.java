package Bronze_III;

import java.util.Scanner;

public class ex30889 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		char[][] seat = new char[10][20];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				seat[i][j] = '.';
			}
		}

		sc.nextLine();

		for (int i = 0; i < N; i++) {
			String S = sc.nextLine();

			int row = S.charAt(0) - 'A';
			int col = Integer.parseInt(S.substring(1)) - 1;

			seat[row][col] = 'o';
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print(seat[i][j]);
			}
			System.out.println();
		}

		sc.close();
	}

}
