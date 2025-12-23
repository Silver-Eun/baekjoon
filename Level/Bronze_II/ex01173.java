package Bronze_II;

import java.util.Scanner;

public class ex01173 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int m = sc.nextInt();
		int M = sc.nextInt();
		int T = sc.nextInt();
		int R = sc.nextInt();

		if (m + T > M) {
			System.out.println(-1);
			return;
		}

		int current = m;
		int exercise = 0;
		int time = 0;

		while (exercise < N) {
			time++;

			if (current + T <= M) {
				current += T;
				exercise++;
			} else {
				current -= R;
				if (current < m) {
					current = m;
				}
			}
		}

		System.out.println(time);

		sc.close();
	}

}
