package Bronze_III;

import java.math.BigInteger;
import java.util.Scanner;

public class ex01837 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigInteger P = new BigInteger(sc.next());
		int K = sc.nextInt();

		sc.close();

		for (int i = 2; i < K; i++) {
			if (P.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
				System.out.println("BAD " + i);
				return;
			}
		}

		System.out.println("GOOD");
	}
}
