package Bronze_IV;

import java.util.Scanner;

public class ex31692 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] A = sc.nextLine().split(" ");
		int N = Integer.parseInt(A[0]);
		int X = Integer.parseInt(A[1]);
		int S, T;
		int maxS = -1;

		for (int i = 0; i < N; i++) {
			String[] B = sc.nextLine().split(" ");
			int s = Integer.parseInt(B[0]);
			int t = Integer.parseInt(B[1]);

			if ((s + t) <= X) {
				if (s > maxS) {
					maxS = s;
				}
			}
		}

		sc.close();

		System.out.println(maxS);
	}
}
