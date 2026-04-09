package Bronze_II;

import java.util.Scanner;

public class ex03062 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();

			String s = String.valueOf(N);
			String rev = new StringBuilder(s).reverse().toString();

			int sum = N + Integer.parseInt(rev);

			String str = String.valueOf(sum);

			String reversed = new StringBuilder(str).reverse().toString();

			if (str.equals(reversed))
				System.out.println("YES");
			else
				System.out.println("NO");
		}

		sc.close();
	}

}
