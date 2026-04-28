package Bronze_III;

import java.util.Scanner;

public class ex33277 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		double t = ((double) M / N) * 24 * 60;

		int h = (int) t / 60;
		int m = (int) t % 60;

		System.out.printf("%02d:%02d\n", h, m);

		sc.close();
	}

}
