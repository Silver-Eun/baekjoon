package Bronze_III;

import java.util.Scanner;

public class ex31776 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int team = 0;

		for (int i = 0; i < N; i++) {
			int[] t = new int[3];
			boolean solvedAny = false;

			for (int j = 0; j < 3; j++) {
				t[j] = sc.nextInt();
				if (t[j] != -1)
					solvedAny = true;
			}

			if (!solvedAny)
				continue;

			for (int j = 0; j < 3; j++) {
				if (t[j] == -1)
					t[j] = 999;
			}

			if (t[0] <= t[1] && t[1] <= t[2]) {
				team++;
			}
		}

		System.out.println(team);
		sc.close();
	}
}
