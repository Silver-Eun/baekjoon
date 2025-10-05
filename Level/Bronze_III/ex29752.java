package Bronze_III;

import java.util.Scanner;

public class ex29752 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = 0;
		int max = 0;

		for (int i = 0; i < N; i++) {
			int s = sc.nextInt();

			if (s != 0) {
				cnt++;
				if (cnt > max) max = cnt;
			} else if (s == 0)
				cnt = 0;
		}

		System.out.println(max);

		sc.close();
	}

}
