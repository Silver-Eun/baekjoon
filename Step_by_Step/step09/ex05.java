package step09;

import java.util.Scanner;

public class ex05 {

	public static boolean prime[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		// 배열 생성
		prime = new boolean[N + 1];
		get_prime();

		// 소수 합 및 최솟값
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for (int i = M; i <= N; i++) {
			// false = 소수
			if (prime[i] == false) {
				sum += i;
				// 첫 소수가 최솟값임
				if (min == Integer.MAX_VALUE) {
					min = i;
				}
			}
		}

		// 소수가 없다면
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}

		sc.close();
	}
	
	// 에라토스테네스 체 알고리즘
	public static void get_prime() {
		prime[0] = true;
		prime[1] = true;

		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}

	}
}
