package Bronze_II;

import java.util.Scanner;

public class ex05054 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();

			int min = 100;
			int max = 0;

			for (int j = 0; j < n; j++) {
				int w = sc.nextInt();

				if (max < w)
					max = w;
				if (w < min)
					min = w;
			}

			System.out.println((max - min) * 2);
		}

		sc.close();
	}

}
