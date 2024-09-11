package Bronze_III;

import java.util.Scanner;

public class ex09550 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < T; i++) {
			String[] a = sc.nextLine().split(" ");

			int N = Integer.parseInt(a[0]);
			int K = Integer.parseInt(a[1]);

			int candy = 0;

			String[] b = sc.nextLine().split(" ");

			for (int j = 0; j < N; j++) {
				int c1 = Integer.parseInt(b[j]);

				candy += c1 / K;
			}

			System.out.println(candy);
		}

		sc.close();
	}

}
