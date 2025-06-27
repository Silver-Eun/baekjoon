package Bronze_III;

import java.util.Scanner;

public class ex10179 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int x = 0; x < n; x++) {
			double a = sc.nextDouble();
			double discounted = a * 0.8;
			System.out.println("$" + String.format("%.2f", discounted));
		}

		sc.close();
	}

}
