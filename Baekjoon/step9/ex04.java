package step9;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int count = 0;

		for (int i = 0; i < N; i++) {

			// 소수인 경우 true, 아닌 경우 false
			boolean isPrime = true;

			int num = sc.nextInt();

			// 1인 경우 다음 반복문으로
			if (num == 1) {
				continue;
			}
			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					// 소수가 아니므로 false로 바꿔줌
					isPrime = false;
					break;
				}
			}
			// 소수인경우 count 값 1 증가
			if (isPrime) {
				count++;
			}
		}
		System.out.println(count);

		sc.close();
	}

}
