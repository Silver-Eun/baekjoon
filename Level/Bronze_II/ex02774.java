package Bronze_II;

import java.util.Scanner;

public class ex02774 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int X = sc.nextInt();

			boolean[] used = new boolean[10];
			int count = 0;

			while (X > 0) {
				int digit = X % 10;

				if (!used[digit]) {
					used[digit] = true;
					count++;
				}

				X /= 10;
			}

			System.out.println(count);
		}
		sc.close();
	}

}
