package Bronze_IV;

import java.util.Scanner;

public class ex10987 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String A = "aeiou";

		int count = 0;
		sc.close();

		for (int i = 0; i < S.length(); i++) {
			for (int j = 0; j < A.length(); j++) {
				if (S.charAt(i) == A.charAt(j))
					count++;
			}
		}

		System.out.println(count);
	}

}
