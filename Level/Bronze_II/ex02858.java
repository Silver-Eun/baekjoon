package Bronze_II;

import java.util.Scanner;

public class ex02858 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int R = sc.nextInt();
		int B = sc.nextInt();

		int m = R + B;

		for (int L = 1; L <= m; L++) {
			if (m % L == 0) {
				int W = m / L;
				if ((L - 2) * (W - 2) == B) {
					if (L >= W)
						System.out.println(L + " " + W);
					else
						System.out.println(W + " " + L);
					break;
				}
			}

		}

		sc.close();
	}

}
