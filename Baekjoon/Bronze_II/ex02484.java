package Bronze_II;

import java.util.Scanner;

public class ex02484 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int maxPrize = 0;

		for (int p = 0; p < N; p++) {

			int[] count = new int[7];

			for (int i = 0; i < 4; i++)
				count[sc.nextInt()]++;

			int prize = 0;
			int pair = 0;
			int max = 0;

			for (int i = 1; i <= 6; i++) {

				if (count[i] > 0)
					max = i;

				if (count[i] == 4)
					prize = 50000 + i * 5000;

				else if (count[i] == 3)
					prize = 10000 + i * 1000;

				else if (count[i] == 2)
					pair = pair == 0 ? i : 2000 + pair * 500 + i * 500;
			}

			if (prize == 0) {
				if (pair >= 2000)
					prize = pair;
				else if (pair > 0)
					prize = 1000 + pair * 100;
				else
					prize = max * 100;
			}

			maxPrize = Math.max(maxPrize, prize);
		}

		System.out.println(maxPrize);
		sc.close();
	}
}