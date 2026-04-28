package Bronze_II;

import java.util.Scanner;

public class ex01159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] a = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < N; i++) {
			String n = sc.next();
			int j = n.charAt(0) - 'a';
			a[j]++;
		}

		boolean found = false;

		for (int i = 0; i < a.length; i++) {
			if (5 <= a[i]) {
				char c = (char) ('a' + i);
				System.out.print(c);
				found = true;
			}
		}

		if (!found) {
			System.out.println("PREDAJA");
		}

		sc.close();
	}

}
