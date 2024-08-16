package Bronze_III;

import java.util.Scanner;

public class ex04388 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int cnt = 0;
			int add = 0;

			String[] A = sc.nextLine().split(" ");

			int a = Integer.parseInt(A[0]);
			int b = Integer.parseInt(A[1]);

			if (a == 0 && b == 0) {
				break;
			}

			String c = Integer.toString(Math.max(a, b));

			for (int i = 0; i < c.length(); i++) {
				if (a % 10 + b % 10 + add >= 10) {
					cnt++;
					add++;
				}

				a /= 10;
				b /= 10;
			}
			
			System.out.println(cnt);
		}

		sc.close();
	}

}
