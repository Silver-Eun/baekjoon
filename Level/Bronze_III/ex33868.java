package Bronze_III;

import java.util.Scanner;

public class ex33868 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			int T = sc.nextInt();
			int B = sc.nextInt();

			if (max < T)
				max = T;
			if (B < min)
				min = B;
		}

		int remainder = ((max * min) % 7) + 1;

		System.out.println(remainder);

		sc.close();
	}

}
