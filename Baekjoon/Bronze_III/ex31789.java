package Bronze_III;

import java.util.Scanner;

public class ex31789 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int X = sc.nextInt();
		int S = sc.nextInt();

		boolean go = false;

		for (int i = 0; i < N; i++) {
			int c = sc.nextInt();
			int p = sc.nextInt();

			if (c <= X && S < p)
				go = true;
		}

		System.out.println(go ? "YES" : "NO");

		sc.close();
	}

}
