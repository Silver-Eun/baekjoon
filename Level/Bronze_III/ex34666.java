package Bronze_III;

import java.util.Scanner;

public class ex34666 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Q = sc.nextInt();

		for (int i = 0; i < Q; i++) {

			int g = sc.nextInt();
			int lang = sc.nextInt();
			int read = sc.nextInt();
			int listen = sc.nextInt();

			if (!(g == 1 || g == 2)) {
				System.out.println("NO");
				continue;
			}

			if (listen < 50) {
				System.out.println("NO");
				continue;
			}

			int pass = (g == 1 ? 100 : 90);
			int fail = 18;

			int cond31 = 0;
			if (3 * lang < pass)
				cond31++;
			if (3 * read < pass)
				cond31++;

			boolean cond32 = false;
			if (lang <= fail + 3 || read <= fail + 3)
				cond32 = true;

			if (cond31 >= 2 || cond32)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

		sc.close();
	}

}
