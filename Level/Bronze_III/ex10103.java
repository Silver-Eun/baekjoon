package Bronze_III;

import java.util.Scanner;

public class ex10103 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int c = 100, s = 100;

		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String[] a = sc.nextLine().split(" ");

			int num1 = Integer.parseInt(a[0]);
			int num2 = Integer.parseInt(a[1]);

			if (num1 < num2) {
				c -= num2;
			} else if (num1 > num2) {
				s -= num1;
			}
		}

		System.out.println(c);
		System.out.println(s);

		sc.close();
	}

}
