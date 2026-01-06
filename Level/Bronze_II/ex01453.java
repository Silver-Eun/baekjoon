package Bronze_II;

import java.util.Scanner;

public class ex01453 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		boolean[] p = new boolean[101];

		int cnt = 0;

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			if (p[x] == true)
				cnt++;
			else
				p[x] = true;

		}

		System.out.println(cnt);

		sc.close();
	}

}
