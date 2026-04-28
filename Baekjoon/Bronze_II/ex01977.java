package Bronze_II;

import java.util.Scanner;

public class ex01977 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int sum = 0;
		int min = -1;

		for (int i = 1; i <= 100; i++) {
			if (i * i <= N && M <= i * i) {
				sum += i * i;
				if (min == -1) {
					min = i * i;
				}
			}
		}

		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}

		sc.close();
	}

}
