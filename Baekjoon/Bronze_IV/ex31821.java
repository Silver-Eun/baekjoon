package Bronze_IV;

import java.util.Scanner;

public class ex31821 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total = 0;
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int M = sc.nextInt();
		int[] arr1 = new int[M];

		for (int i = 0; i < M; i++) {
			arr1[i] = sc.nextInt();
			for (int j = 1; j <= N; j++) {
				if (arr1[i] == j) {
					total += arr[j - 1];
				}
			}
		}
		
		sc.close();

		System.out.println(total);
	}

}
