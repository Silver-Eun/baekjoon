package step06;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int len = S.length();
		int ans = 1;

		for (int i = 0; i < len / 2; i++) {
			if (S.charAt(i) != S.charAt(len - 1 - i)) {
				ans = 0;
			}
		}

		System.out.println(ans);

		sc.close();
	}

}
