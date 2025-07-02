package Bronze_III;

import java.util.Scanner;

public class ex10214 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int y = 0;
			int k = 0;
			for (int j = 0; j < 9; j++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				y = y + a;
				k = k + b;
			}
			if (y == k) {
				System.out.println("Draw");
			} else if (y < k) {
				System.out.println("Korea");
			} else {
				System.out.println("Yonsei");
			}
		}
		sc.close();
	}

}
