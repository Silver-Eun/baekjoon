package Bronze_II;

import java.util.Scanner;

public class ex03028 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] cup = { 1, 0, 0 };

		String s = sc.next();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == 'A') {
				int temp = cup[0];
				cup[0] = cup[1];
				cup[1] = temp;
			} else if (c == 'B') {
				int temp = cup[1];
				cup[1] = cup[2];
				cup[2] = temp;
			} else {
				int temp = cup[0];
				cup[0] = cup[2];
				cup[2] = temp;
			}
		}

		for (int i = 0; i < 3; i++) {
			if (cup[i] == 1) {
				System.out.println(i + 1);
			}
		}

		sc.close();
	}

}
