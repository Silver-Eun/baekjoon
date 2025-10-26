package Bronze_III;

import java.util.Scanner;

public class ex32342 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Q = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < Q; i++) {
			String S = sc.nextLine();
			int cnt = 0;
			for (int j = 0; j <= S.length() - 3; j++) {
				if (S.charAt(j) == 'W' && S.charAt(j + 1) == 'O' && S.charAt(j + 2) == 'W') {
					cnt++;
				}
			}
			System.out.println(cnt);

		}

		sc.close();
	}

}
