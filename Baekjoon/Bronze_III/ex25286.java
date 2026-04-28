package Bronze_III;

import java.util.Scanner;

public class ex25286 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < T; i++) {
			String A = sc.nextLine();
			String[] B = A.split(" ");

			int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

			int y = Integer.valueOf(B[0]);
			int m = Integer.valueOf(B[1]);

			int y1, m1, d = 0;

			if (m == 1) {
				y1 = y - 1;
			} else
				y1 = y;

			m1 = m - 1;

			if (m1 < 1)
				m1 += 12;

			d = days[m1 - 1];

			if ((y1 % 400 == 0) || (y1 % 4 == 0 && y1 % 100 != 0))
				if (m1 == 2)
					d = 29;

			System.out.println(y1 + " " + m1 + " " + d);
		}

		sc.close();
	}

}
