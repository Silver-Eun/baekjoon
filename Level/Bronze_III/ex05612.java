package Bronze_III;

import java.util.Scanner;

public class ex05612 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		sc.nextLine();

		int max = m;
		int cnt = m;

		boolean empty = true;

		for (int i = 0; i < n; i++) {
			String[] A = sc.nextLine().split(" ");

			int a = Integer.parseInt(A[0]);
			int b = Integer.parseInt(A[1]);

			cnt += a;
			cnt -= b;

			if (cnt < 0) {
				empty = false;
			}

			max = Math.max(max, cnt);
		}
		sc.close();

		if (!empty)
			System.out.println(0);
		else
			System.out.println(max);

	}
}
