package Bronze_II;

import java.util.Scanner;

public class ex01871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		sc.nextLine();

		for (int j = 0; j < N; j++) {

			String S = sc.nextLine();

			String[] s = S.split("-");

			String a = s[0];
			int b = Integer.parseInt(s[1]);

			double c = 0;

			int d = 0;

			for (int i = a.length() - 1; i >= 0; i--) {
				d += (a.charAt(i) - 'A') * Math.pow(26, c);
				c++;
			}
			
			if (Math.abs(d - b) <= 100)
				System.out.println("nice");
			else
				System.out.println("not nice");

		}
		sc.close();
	}

}
