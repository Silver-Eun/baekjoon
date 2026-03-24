package Bronze_II;

import java.util.Scanner;

public class ex02756 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		while (T-- > 0) {
			double[] arr = new double[12];

			for (int i = 0; i < 12; i++) {
				arr[i] = sc.nextDouble();
			}

			int p1 = 0;
			int p2 = 0;

			for (int i = 0; i < 6; i += 2) {
				double d = arr[i] * arr[i] + arr[i + 1] * arr[i + 1];

				if (d <= 9)
					p1 += 100;
				else if (d <= 36)
					p1 += 80;
				else if (d <= 81)
					p1 += 60;
				else if (d <= 144)
					p1 += 40;
				else if (d <= 225)
					p1 += 20;
			}

			for (int i = 6; i < 12; i += 2) {
				double d = arr[i] * arr[i] + arr[i + 1] * arr[i + 1];

				if (d <= 9)
					p2 += 100;
				else if (d <= 36)
					p2 += 80;
				else if (d <= 81)
					p2 += 60;
				else if (d <= 144)
					p2 += 40;
				else if (d <= 225)
					p2 += 20;
			}

			if (p1 > p2) {
				System.out.println("SCORE: " + p1 + " to " + p2 + ", PLAYER 1 WINS.");
			} else if (p2 > p1) {
				System.out.println("SCORE: " + p1 + " to " + p2 + ", PLAYER 2 WINS.");
			} else {
				System.out.println("SCORE: " + p1 + " to " + p2 + ", TIE.");
			}
		}

		sc.close();
	}
}
