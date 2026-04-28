package Bronze_II;

import java.util.Scanner;

public class ex01864 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String S = sc.nextLine();

			if (S.equals("#"))
				break;

			long ans = 0;

			for (int i = 0; i < S.length(); i++) {
				int value = 0;

				switch (S.charAt(i)) {
				case '-':
					value = 0;
					break;
				case '\\':
					value = 1;
					break;
				case '(':
					value = 2;
					break;
				case '@':
					value = 3;
					break;
				case '?':
					value = 4;
					break;
				case '>':
					value = 5;
					break;
				case '&':
					value = 6;
					break;
				case '%':
					value = 7;
					break;
				case '/':
					value = -1;
					break;
				}

				ans = ans * 8 + value;
			}

			System.out.println(ans);
		}

		sc.close();
	}

}
