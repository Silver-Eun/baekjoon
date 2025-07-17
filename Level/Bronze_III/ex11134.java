package Bronze_III;

import java.util.Scanner;

public class ex11134 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int A = 0;

			int N = sc.nextInt();
			int C = sc.nextInt();

			A = N / C;
			if (N % C != 0 && C > N % C) {
				A++;
			}

			System.out.println(A);
		}

		sc.close();
	}

}
