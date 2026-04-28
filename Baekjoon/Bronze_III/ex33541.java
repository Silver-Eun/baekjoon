package Bronze_III;

import java.util.Scanner;

public class ex33541 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = -1;

		for (int year = X + 1; year <= 9999; year++) {
			int a = year / 100;
			int b = year % 100;

			if ((a + b) * (a + b) == year) {
				Y = year;
				break;
			}
		}

		System.out.println(Y);

		sc.close();
	}

}
