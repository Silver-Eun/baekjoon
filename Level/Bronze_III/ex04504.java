package Bronze_III;

import java.util.Scanner;

public class ex04504 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		while (true) {

			int m = sc.nextInt();

			if (m == 0)
				break;

			if (m % n == 0) {
				System.out.println(m + " is a multiple of " + n + ".");
			} else {
				System.out.println(m + " is NOT a multiple of " + n + ".");
			}
		}

		sc.close();
	}

}
