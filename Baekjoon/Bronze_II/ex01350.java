package Bronze_II;

import java.util.Scanner;

public class ex01350 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int C = sc.nextInt();

		long sum = 0;

		for (int i = 0; i < N; i++) {
			if (arr[i] > 0) {
				long clusters = (arr[i] + C - 1) / C;
				sum += clusters * C;
			}
		}

		System.out.println(sum);

		sc.close();
	}

}
