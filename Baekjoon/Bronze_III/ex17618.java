package Bronze_III;

import java.util.Scanner;

public class ex17618 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = 0;

		for (int i = 1; i <= N; i++) {
			int sum = 0;
			int temp = i;

			while (temp > 0) {
				sum += temp % 10;
				temp /= 10;
			}

			if (i % sum == 0) {
				cnt++;
			}
		}

		System.out.println(cnt);

		sc.close();
	}

}
