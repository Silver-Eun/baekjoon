package Bronze_III;

import java.math.BigInteger;
import java.util.Scanner;

public class ex16428 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();

		BigInteger[] result = A.divideAndRemainder(B);
        BigInteger q = result[0];
        BigInteger r = result[1];

        if (r.signum() < 0) {
            q = q.subtract(BigInteger.ONE);
            r = r.add(B.abs());
        }

        System.out.println(q);
        System.out.println(r);

        sc.close();

	}

}
