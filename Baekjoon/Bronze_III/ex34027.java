package Bronze_III;

import java.util.Scanner;

public class ex34027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();

			int a = (int) Math.sqrt(N);

			if (a * a == N)
				System.out.println(1);
			else
				System.out.println(0);
		}

		sc.close();
	}

}
