package Bronze_II;

import java.util.Scanner;

public class ex01550 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		int a = 0;

		int power = 1;

		for (int i = s.length() - 1; i >= 0; i--) {

			char c = s.charAt(i);

			if (c >= '0' && c <= '9') {
				a += (c - '0') * power;
			} else if (c >= 'A' && c <= 'F') {
				a += (c - 'A' + 10) * power;
			}
			power *= 16;
		}

		System.out.println(a);

		sc.close();
	}

}
