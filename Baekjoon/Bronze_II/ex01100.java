package Bronze_II;

import java.util.Scanner;

public class ex01100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] c = new String[8];
		int cnt = 0;

		for (int i = 0; i < 8; i++) {
			c[i] = sc.nextLine();
		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((i + j) % 2 == 0 && c[i].charAt(j) == 'F') {
					cnt++;
				}
			}
		}

		System.out.println(cnt);

		sc.close();
	}

}
