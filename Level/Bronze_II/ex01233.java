package Bronze_II;

import java.util.Scanner;

public class ex01233 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int S1 = sc.nextInt();
		int S2 = sc.nextInt();
		int S3 = sc.nextInt();

		int[] arr = new int[S1 + S2 + S3 + 1];

		int max = 0;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}

		for (int i = 1; i <= S1; i++) {
			for (int j = 1; j <= S2; j++) {
				for (int k = 1; k <= S3; k++) {
					arr[i + j + k]++;
				}
			}
		}

		for (int s = 3; s <= S1 + S2 + S3; s++) {
			if (arr[s] > max) {
				max = arr[s];
				sum = s;
			}
		}

		System.out.println(sum);

		sc.close();
	}

}
