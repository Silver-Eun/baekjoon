package Bronze_III;

import java.util.Scanner;

public class ex31561 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		double real;

		if (M <= 30) {
			real = M / 2.0;
		} else {
			real = (6 * M - 120) / 4.0;
		}

		System.out.printf("%.1f", real);

		sc.close();
	}

}
