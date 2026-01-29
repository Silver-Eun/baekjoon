package Bronze_II;

import java.util.Scanner;

public class ex02139 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] day = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		while (true) {
			int d = sc.nextInt();
			int m = sc.nextInt();
			int y = sc.nextInt();

			if (d == 0 && m == 0 && y == 0)
				break;

			int sum = d;

			for (int i = 1; i < m; i++) {
				sum += day[i];
			}

			if (((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) && m > 2)
				sum++;

			System.out.println(sum);
		}

		sc.close();
	}

}
