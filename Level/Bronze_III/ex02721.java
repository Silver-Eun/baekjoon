package Bronze_III;

import java.util.Scanner;

public class ex02721 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			int sum = 0;
			for (int j = 1; j <= n; j++) {
				sum += j * (j + 1) * (j + 2) / 2;
			}
			System.out.println(sum);
		}

		sc.close();

	}

}
