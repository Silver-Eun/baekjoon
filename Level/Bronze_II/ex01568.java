package Bronze_II;

import java.util.Scanner;

public class ex01568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();

		long r = N;
		long K = 1;
		long t = 0;

		while (r > 0) {
			if (K > r) {
				K = 1;
			}
			r -= K;
			K++;
			t++;
		}

		System.out.println(t);

		sc.close();
	}

}
