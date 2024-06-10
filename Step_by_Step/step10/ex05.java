package step10;

import java.util.Arrays;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		// X 좌표
		int[] A = new int[N];
		// Y 좌표
		int[] B = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}

		// 정렬
		Arrays.sort(A);
		Arrays.sort(B);

		System.out.println((A[N - 1] - A[0]) * (B[N - 1] - B[0]));

		sc.close();
	}

}
