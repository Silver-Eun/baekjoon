package Bronze_III;

import java.util.Scanner;
import java.math.BigInteger;

public class ex02547 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = Integer.parseInt(sc.nextLine().trim());

		for (int j = 0; j < T; j++) {
			sc.nextLine();

			int N = Integer.parseInt(sc.nextLine().trim());

			BigInteger sum = BigInteger.ZERO;

			for (int i = 0; i < N; i++) {
				BigInteger a = new BigInteger(sc.nextLine().trim());
				sum = sum.add(a);
			}

			if (sum.mod(BigInteger.valueOf(N)).equals(BigInteger.ZERO)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

		sc.close();
	}
}
