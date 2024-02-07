package step5;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			String S = sc.next();

			System.out.println(S.charAt(0) + "" + S.charAt(S.length() - 1));
		}

		sc.close();
	}

}
