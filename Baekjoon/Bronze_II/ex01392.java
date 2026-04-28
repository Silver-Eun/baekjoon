package Bronze_II;

import java.util.Scanner;

public class ex01392 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Q = sc.nextInt();

		int[] T = new int[N];
		int[] sum = new int[N];

		for (int i = 0; i < N; i++) {
			T[i] = sc.nextInt();
		}

		sum[0] = T[0];
		for (int i = 1; i < N; i++) {
			sum[i] = sum[i - 1] + T[i];
		}

		for (int i = 0; i < Q; i++) {
			int t = sc.nextInt();
			for (int j = 0; j < N; j++) {
				if (t < sum[j]) {
					System.out.println(j + 1);
					break;
				}
			}
		}

		sc.close();
	}

}
