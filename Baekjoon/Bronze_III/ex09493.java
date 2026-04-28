package Bronze_III;

import java.util.Scanner;

public class ex09493 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String[] a = sc.nextLine().split(" ");

			double M = Double.parseDouble(a[0]);
			int A = Integer.parseInt(a[1]);
			int B = Integer.parseInt(a[2]);

			if (M == 0 && A == 0 && B == 0) {
				break;
			}

			double t = Math.round(Math.abs(M / A - M / B) * 3600);

			int h = (int) (t / 3600);
			int m = (int) ((t / 60) % 60);
			int s = (int) (t % 60);

			System.out.format("%d:%02d:%02d\n", h, m, s);
		}
		sc.close();
	}

}
