package Bronze_III;

import java.util.Scanner;

public class ex34115 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] arr = new int[2 * N];
		int[] first = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			first[i] = -1;
		}

		for (int i = 0; i < 2 * N; i++) {
			arr[i] = sc.nextInt();
		}

		int answer = 0;

		for (int i = 0; i < 2 * N; i++) {
			int x = arr[i];

			if (first[x] == -1) {
				first[x] = i;
			} else {
				int between = i - first[x] - 1;
				if (between > answer)
					answer = between;
			}
		}

		System.out.println(answer);

		sc.close();
	}
}
