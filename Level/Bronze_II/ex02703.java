package Bronze_II;

import java.util.Scanner;

public class ex02703 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < T; i++) {

			String A = sc.nextLine();
			String B = sc.nextLine();

			char[] map = new char[26];

			for (int j = 0; j < 26; j++) {
			    map[j] = B.charAt(j);
			}

			for (int k = 0; k < A.length(); k++) {
			    char c = A.charAt(k);

			    if (c == ' ')
			        System.out.print(c);
			    else
			        System.out.print(map[c - 'A']);
			}
			
			System.out.println();
		}

		sc.close();
	}
}