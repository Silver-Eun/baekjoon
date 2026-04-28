package Bronze_IV;

import java.util.Scanner;

public class ex25238 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		double b = sc.nextDouble();
		sc.close();
		double c = 0;

		if (b == 0) {
			
		} else {
			c = a - (a * (b / 100));
		}

		if (c >= 100) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}

}
