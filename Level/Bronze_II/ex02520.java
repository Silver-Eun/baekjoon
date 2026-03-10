package Bronze_II;

import java.util.Scanner;

public class ex02520 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int c = sc.nextInt();
			int y = sc.nextInt();
			int su = sc.nextInt();
			int sa = sc.nextInt();
			int f = sc.nextInt();

			int dough = (int) (16 * Math.min(Math.min(c / 8.0, y / 8.0), Math.min(Math.min(su / 4.0, sa), f / 9.0)));

			int b = sc.nextInt();
			int gs = sc.nextInt();
			int gc = sc.nextInt();
			int w = sc.nextInt();

			int topping = b + gs / 30 + gc / 25 + w / 10;

			int answer = Math.min(dough, topping);

			System.out.println(answer);
		}

		sc.close();
	}

}
