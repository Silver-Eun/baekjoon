package Bronze_II;

import java.util.Scanner;

public class ex01668 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] t = new int[N];

		int countL = 0;
		int countR = 0;

		int maxL = 0;
		int maxR = 0;

		for (int i = 0; i < N; i++) {
			t[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			if (maxL < t[i]) {
				countL++;
				maxL = t[i];
			}
		}

		for (int i = N - 1; i >= 0; i--) {
			if (maxR < t[i]) {
				countR++;
				maxR = t[i];
			}
		}

		System.out.println(countL);
		System.out.println(countR);

		sc.close();
	}

}
