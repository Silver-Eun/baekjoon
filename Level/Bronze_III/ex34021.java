package Bronze_III;

import java.util.Scanner;

public class ex34021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int L = sc.nextInt();

			int freezeByTime = M - L;
			int freezeByPlayer = Integer.MAX_VALUE;

			for (int i = 0; i < N; i++) {
				int s = sc.nextInt();
				if (s != -1 && s <= M) {
					freezeByPlayer = Math.min(freezeByPlayer, s);
				}
			}

			int freezeMoment = (freezeByPlayer == Integer.MAX_VALUE) ? freezeByTime
					: Math.min(freezeByTime, freezeByPlayer);

			int X = M - freezeMoment;
			String unit = (X == 1) ? "minute" : "minutes";

			System.out.println("The scoreboard has been frozen with " + X + " " + unit + " remaining.");
		}

		sc.close();
	}
}
