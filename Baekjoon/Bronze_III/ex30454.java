package Bronze_III;

import java.util.Scanner;

public class ex30454 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int L = sc.nextInt();
		sc.nextLine();

		int maxStripe = 0;
		int count = 0;

		for (int i = 0; i < N; i++) {
			String s = sc.nextLine();
			int stripe = 0;
			boolean inBlack = false;

			for (int j = 0; j < L; j++) {
				if (s.charAt(j) == '1') {
					if (!inBlack) {
						stripe++;
						inBlack = true;
					}
				} else {
					inBlack = false;
				}
			}

			if (stripe > maxStripe) {
				maxStripe = stripe;
				count = 1;
			} else if (stripe == maxStripe) {
				count++;
			}
		}

		System.out.println(maxStripe + " " + count);

		sc.close();
	}
}
