package Bronze_II;

import java.util.Scanner;

public class ex01009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		int[][] cycle = { { 10 },
				{ 1 },
				{ 2, 4, 8, 6 },
				{ 3, 9, 7, 1 },
				{ 4, 6 },
				{ 5 },
				{ 6 },
				{ 7, 9, 3, 1 },
				{ 8, 4, 2, 6 },
				{ 9, 1 }
		};

		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int last = a % 10;
			int[] arr = cycle[last];

			int idx = (b - 1) % arr.length;
			System.out.println(arr[idx]);
		}

		sc.close();
	}
}
