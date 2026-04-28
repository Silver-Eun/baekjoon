package Bronze_III;

import java.util.Scanner;

public class ex34125 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] seat = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				seat[i][j] = sc.nextInt();
			}
		}

		int center = (M + 1) / 2;
		int bestDist = Integer.MAX_VALUE;
		int bestR = -1, bestC = -1;

		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				if (seat[r][c] == 0) {
					int R = r + 1;
					int C = c + 1;
					int dist = R + Math.abs(center - C);

					if (dist < bestDist) {
						bestDist = dist;
						bestR = R;
						bestC = C;
					}
				}
			}
		}

		if (bestR == -1)
			System.out.println("-1");
		else
			System.out.println(bestR + " " + bestC);

		sc.close();
	}

}
