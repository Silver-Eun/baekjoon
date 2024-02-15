package step8;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 테스트 케이스의 개수
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			// 거스름돈
			int C = sc.nextInt();

			// 쿼터의 개수
			int Q = (C / 25);
			C -= Q * 25;

			// 다임의 개수
			int D = (C / 10);
			C -= D * 10;

			// 니켈의 개수
			int N = (C / 5);
			C -= N * 5;

			// 페니의 개수
			int P = (C / 1);

			System.out.println(Q + " " + D + " " + N + " " + P);
		}
		
		sc.close();
	}

}
