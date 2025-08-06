package Bronze_III;

import java.util.Scanner;

public class ex16504 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[][] array = new long[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				array[i][j] = sc.nextLong();
			}
		}

		boolean fold = true;
		int row = N;
		int col = N;

		while (row > 1 || col > 1) {
			if (fold) {
				long[][] next = new long[row][col / 2];
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col / 2; j++) {
						next[i][j] = array[i][j] + array[i][col - 1 - j];
					}
				}
				col /= 2;
				array = next;
			} else {
				long[][] next = new long[row / 2][col];
				for (int i = 0; i < row / 2; i++) {
					for (int j = 0; j < col; j++) {
						next[i][j] = array[i][j] + array[row - 1 - i][j];
					}
				}
				row /= 2;
				array = next;
			}
			fold = !fold;
		}

		System.out.println(array[0][0]);
		sc.close();
	}
}