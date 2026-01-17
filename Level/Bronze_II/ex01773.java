package Bronze_II;

import java.util.Scanner;

public class ex01773 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int C = sc.nextInt();

		int[] t = new int[N];
		boolean[] f = new boolean[C];

		int time = 0;

		for (int i = 0; i < N; i++) {
			t[i] = sc.nextInt();

			for (int T = t[i]; T <= C; T += t[i]) {
				f[T - 1] = true;
			}
		}

		for (int i = 0; i < C; i++) {
			if (f[i] == true)
				time++;
		}

		System.out.println(time);

		sc.close();
	}

}
