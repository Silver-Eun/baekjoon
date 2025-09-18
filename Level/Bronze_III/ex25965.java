package Bronze_III;

import java.util.Scanner;

public class ex25965 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int t = 0; t < N; t++) {
			int M = sc.nextInt();

			long k = 0, d = 0, a = 0;
			long[] K = new long[M];
			long[] D = new long[M];
			long[] A = new long[M];

			for (int i = 0; i < M; i++) {
				K[i] = sc.nextLong();
				D[i] = sc.nextLong();
				A[i] = sc.nextLong();
			}

			k = sc.nextInt();
			d = sc.nextInt();
			a = sc.nextInt();

			long total = 0;
			for (int i = 0; i < M; i++) {
			    long score = K[i]*k - D[i]*d + A[i]*a;
			    if (score < 0) score = 0;
			    total += score;
			}

			System.out.println(total);
		}

		sc.close();
	}

}
