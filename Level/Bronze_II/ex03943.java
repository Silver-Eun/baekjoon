package Bronze_II;

import java.util.Scanner;

public class ex03943 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();

			long max = n;

			while (n != 1) {
				if (n % 2 == 0)
					n /= 2;
				else
					n = n * 3 + 1;

				max = Math.max(max, n);
			}
			
			System.out.println(max);
		}

		sc.close();
	}

}
