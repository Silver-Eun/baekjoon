package Bronze_III;

import java.math.BigInteger;
import java.util.Scanner;

public class ex05988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			BigInteger K = sc.nextBigInteger();
			BigInteger two = new BigInteger("2");
			
			if( K.remainder(two).equals(BigInteger.ZERO)) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
		
		sc.close();
	}

}
