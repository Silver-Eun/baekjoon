package Bronze_III;

import java.util.Scanner;

public class ex04880 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String[] a = sc.nextLine().split(" ");
			int A = Integer.parseInt(a[0]);
			int B = Integer.parseInt(a[1]);
			int C = Integer.parseInt(a[2]);

			if (A == 0 && B == 0 && C == 0) {
				break;
			}

			if (C - B == B - A) {
				System.out.println("AP " + (2 * C - B));
			} else {
				System.out.println("GP " + (C * C / B));
			}
		}

		sc.close();
	}

}
