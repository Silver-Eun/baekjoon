package Bronze_III;

import java.util.Scanner;

public class ex30394 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long max = Long.MIN_VALUE;
		long min = Long.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			long x = sc.nextLong();
			long y = sc.nextLong();

			if (max < y)
				max = y;
			if (y < min)
				min = y;
		}

		System.out.println(max - min);

		sc.close();
	}

}
