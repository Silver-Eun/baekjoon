package step09;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 정수 N
		int N = sc.nextInt();

		for (int i = 2; i <= N; i++) {
			while (N % i == 0) {
				System.out.println(i);
				N /= i;
			}
		}
		// 마지막 수 출력
//		if (N != 1) {
//			System.out.println(N);
//		}

		sc.close();
	}

}
