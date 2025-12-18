package Bronze_II;

import java.util.Scanner;

public class ex01075 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int F = sc.nextInt();

		int base = (N / 100) * 100;
		int ans = 0;

		for (int i = 0; i < 100; i++) {
			if ((base + i) % F == 0) {
				ans = i;
				break;
			}
		}

		System.out.printf("%02d", ans);

		sc.close();
	}

}
