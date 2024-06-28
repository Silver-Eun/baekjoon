package Bronze_IV;

import java.util.Scanner;

public class ex10808 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		int n[] = new int[26];

		for (int i = 0; i < S.length(); i++) {
			n[S.charAt(i) - 97]++;
		}

		for (int i = 0; i < 26; i++) {
			System.out.print(n[i] + " ");
		}

		sc.close();
	}

}
