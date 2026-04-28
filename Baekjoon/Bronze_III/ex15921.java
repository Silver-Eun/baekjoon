package Bronze_III;

import java.util.Scanner;

public class ex15921 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] score = new int[N];
		int sum = 0;

		if (N == 0) {
			System.out.println("divide by zero");
			return;
		}

		for (int i = 0; i < N; i++) {
			score[i] = sc.nextInt();
			sum += score[i];
		}

		if (sum == 0) {
			System.out.println("divide by zero");
			return;
		}

		double avg = (double) sum / N;
		double expected = 0;
		for (int i = 0; i < N; i++) {
			expected += (score[i] / (double) N);
		}

		double result = avg / expected;
		System.out.printf("%.2f\n", result);

		sc.close();
	}

}
