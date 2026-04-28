package Bronze_III;

import java.util.Scanner;

public class ex14579 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 1;

		for (int i = a; i <= b; i++) {
			int sum = i * (i + 1) / 2;
			c = (c * sum) % 14579;
		}

		System.out.println(c);

		sc.close();
	}

}
