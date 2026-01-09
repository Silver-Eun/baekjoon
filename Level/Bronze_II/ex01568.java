package Bronze_II;

import java.util.Scanner;

public class ex01568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int r = N;
		int K = 1;
		int t = 0;

		while (true) {
			t++;
			if (K > r)
				K = 1;
			else {
				r -= K;
				K++;
			}
			if (r == 0)
				break;
		}

		sc.close();
	}

}
