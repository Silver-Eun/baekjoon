package Bronze_II;

import java.util.Scanner;

public class ex04998 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			double N = sc.nextDouble();
			double B = sc.nextDouble();
			double M = sc.nextDouble();

			int year = 0;

			while (N <= M) {
				N *= (1 + B / 100);
				year++;
			}

			System.out.println(year);
		}

		sc.close();
	}

}
