package Bronze_II;

import java.util.Scanner;

public class ex02577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int D = A * B * C;

		String S = Integer.toString(D);

		for (int i = 0; i <= 9; i++) {
			int cnt = 0;

			for (int j = 0; j < S.length(); j++) {
				if (S.charAt(j) - '0' == i)
					cnt++;
			}
			
			System.out.println(cnt);
		}

		sc.close();
	}

}
