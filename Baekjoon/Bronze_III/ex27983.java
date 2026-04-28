package Bronze_III;

import java.util.Scanner;

public class ex27983 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] X = new long[N];
		long[] L = new long[N];
		char[] C = new char[N];

		for (int i = 0; i < N; i++) {
			X[i] = sc.nextLong();
		}
		for (int i = 0; i < N; i++) {
			L[i] = sc.nextLong();
		}
		for (int i = 0; i < N; i++) {
			C[i] = sc.next().charAt(0);
		}

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (C[i] != C[j] && Math.abs(X[i] - X[j]) <= L[i] + L[j]) {
					System.out.println("YES");
					System.out.println((i + 1) + " " + (j + 1));
					sc.close();
					return;
				}
			}
		}

		System.out.println("NO");
		sc.close();
	}

}
