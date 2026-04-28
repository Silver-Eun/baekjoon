package Bronze_III;

import java.util.Scanner;

public class ex34723 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int P = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();

		int ans = Integer.MAX_VALUE;

		for (int p = 1; p <= P; p++) {
			for (int m = 1; m <= M; m++) {
				for (int c = 1; c <= C; c++) {
					int v = (p + m) * (m + c);
					int diff = Math.abs(v - X);
					ans = Math.min(ans, diff);
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}

}
