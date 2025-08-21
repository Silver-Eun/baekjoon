package Bronze_III;

import java.util.Scanner;

public class ex20410 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.nextLine();
		String[] B = A.split(" ");

		int m = Integer.valueOf(B[0]);
		int seed = Integer.valueOf(B[1]);
		int x1 = Integer.valueOf(B[2]);
		int x2 = Integer.valueOf(B[3]);

		int a = 0;
		int c = 0;

		for (int i = 0; i < m; i++) {
			int temp = ((x1 - i * seed) % m + m) % m;

			if ((i * seed + temp) % m == x1 && (i * x1 + temp) % m == x2) {
				a = i;
				c = temp;
			}

		}

		System.out.println(a + " " + c);
	}

}
