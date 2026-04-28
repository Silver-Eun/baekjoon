package Bronze_II;

import java.util.Scanner;

public class ex04592 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int N = sc.nextInt();

			if (N == 0)
				break;

			int prev = sc.nextInt();
			System.out.print(prev + " ");

			for (int i = 1; i < N; i++) {
				int now = sc.nextInt();

				if (now != prev)
					System.out.print(now + " ");

				prev = now;
			}

			System.out.println("$");
		}

		sc.close();
	}
}