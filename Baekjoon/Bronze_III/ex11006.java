package Bronze_III;

import java.util.Scanner;

public class ex11006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		int U = 0;
		int R = 0;

		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			U = (M * 2) - N;
			R = M - U;

			System.out.println(U + " " + R);
		}

		sc.close();
	}

}
