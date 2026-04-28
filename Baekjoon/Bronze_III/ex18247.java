package Bronze_III;

import java.util.Scanner;

public class ex18247 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < T; i++) {
			String A = sc.nextLine();
			String[] B = A.split(" ");

			int N = Integer.valueOf(B[0]);
			int M = Integer.valueOf(B[1]);

			int C = M * 11 + 4;

			if (N < 12 || M < 4) {
				System.out.println(-1);
			} else {
				System.out.println(C);
			}
		}

		sc.close();
	}

}
