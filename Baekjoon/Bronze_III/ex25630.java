package Bronze_III;

import java.util.Scanner;

public class ex25630 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		sc.nextLine();

		String A = sc.nextLine();

		int cnt = 0;

		for (int i = 0; i < N / 2; i++) {
			if (A.charAt(i) != A.charAt(N - i - 1)) {
				cnt++;
			}
		}

		System.out.println(cnt);

		sc.close();
	}

}
