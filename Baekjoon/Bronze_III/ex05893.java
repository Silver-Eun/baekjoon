package Bronze_III;

import java.math.BigInteger;
import java.util.Scanner;

public class ex05893 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String N = sc.nextLine();

        BigInteger number = new BigInteger(N, 2);

        BigInteger result = number.multiply(BigInteger.valueOf(17));

        System.out.println(result.toString(2));

        sc.close();
	}

}
