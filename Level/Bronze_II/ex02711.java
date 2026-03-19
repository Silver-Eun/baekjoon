package Bronze_II;

import java.util.Scanner;

public class ex02711 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();

			String a = sc.next();

			String b = a.substring(0, n - 1) + a.substring(n);

			System.out.println(b);
		}

		sc.close();
	}

}
