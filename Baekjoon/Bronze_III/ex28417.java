package Bronze_III;

import java.util.Arrays;
import java.util.Scanner;

public class ex28417 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int max = 0;

		for (int i = 0; i < N; i++) {
			int run1 = sc.nextInt();
			int run2 = sc.nextInt();
			int runMax = Math.max(run1, run2);

			int[] tricks = new int[5];
			for (int j = 0; j < 5; j++) {
				tricks[j] = sc.nextInt();
			}
			Arrays.sort(tricks);
			int trickSum = tricks[3] + tricks[4];

			int score = runMax + trickSum;
			max = Math.max(max, score);
		}

		System.out.println(max);

		sc.close();
	}

}
