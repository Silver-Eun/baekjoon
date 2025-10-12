package Bronze_III;

import java.util.Scanner;

public class ex31472 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int W = sc.nextInt();

		double r = 0;

		r = Math.sqrt(2 * W) * 4;

		System.out.println((int) r);

		sc.close();
	}

}
