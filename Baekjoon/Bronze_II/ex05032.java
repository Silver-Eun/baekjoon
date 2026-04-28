package Bronze_II;

import java.util.Scanner;

public class ex05032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int e = sc.nextInt();
		int f = sc.nextInt();
		int c = sc.nextInt();

		int s = e + f;

		int cnt = 0;

		while (c <= s) {
			int drink = s / c;
			cnt += drink;
			s = drink + (s % c);
		}

		System.out.println(cnt);

		sc.close();
	}

}
