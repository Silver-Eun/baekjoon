package Bronze_III;

import java.util.Scanner;

public class ex32216 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int T0 = sc.nextInt();

		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}

		int[] T = new int[n + 1];
		T[0] = T0;

		int discomfort = 0;

		for (int i = 0; i < n; i++) {
			if (T[i] > k)
				T[i + 1] = T[i] + d[i] - Math.abs(T[i] - k);
			else if (T[i] < k)
				T[i + 1] = T[i] + d[i] + Math.abs(T[i] - k);
			else
				T[i + 1] = T[i] + d[i];

			discomfort += Math.abs(T[i + 1] - k);
		}

		System.out.println(discomfort);

		sc.close();
	}
}
