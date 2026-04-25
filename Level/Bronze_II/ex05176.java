package Bronze_II;

import java.util.Scanner;

public class ex05176 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();

		for (int i = 0; i < K; i++) {
			int P = sc.nextInt();
			int M = sc.nextInt();

			int[] arr = new int[M + 1];

			for (int j = 0; j < P; j++) {
				int n = sc.nextInt();
				arr[n]++;
			}

			int sum = 0;

			for (int l = 0; l < arr.length; l++) {
				if (1 < arr[l])
					sum += (arr[l] - 1);
			}

			System.out.println(sum);
		}

		sc.close();
	}

}
