package Bronze_II;

import java.util.Scanner;

public class ex02966 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		sc.nextLine();

		String s = sc.nextLine();

		int A = 0;
		int B = 0;
		int C = 0;

		char[] a = { 'A', 'B', 'C' };
		char[] b = { 'B', 'A', 'B', 'C' };
		char[] c = { 'C', 'C', 'A', 'A', 'B', 'B' };

		for (int i = 0; i < N; i++) {
			char ans = s.charAt(i);
			if (ans == a[i % 3])
				A++;
			if (ans == b[i % 4])
				B++;
			if (ans == c[i % 6])
				C++;
		}

		int max = Math.max(A, Math.max(B, C));

		System.out.println(max);

		if (A == max)
			System.out.println("Adrian");
		if (B == max)
			System.out.println("Bruno");
		if (C == max)
			System.out.println("Goran");

		sc.close();
	}

}
