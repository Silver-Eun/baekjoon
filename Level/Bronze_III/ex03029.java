package Bronze_III;

import java.util.Scanner;

public class ex03029 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] a = sc.nextLine().split(":");
		String[] b = sc.nextLine().split(":");

		int h = Integer.parseInt(a[0]);
		int m = Integer.parseInt(a[1]);
		int s = Integer.parseInt(a[2]);

		int h1 = Integer.parseInt(b[0]);
		int m1 = Integer.parseInt(b[1]);
		int s1 = Integer.parseInt(b[2]);

		int h2 = h1 - h;
		int m2 = m1 - m;
		int s2 = s1 - s;

		if (s2 < 0) {
			s2 += 60;
			m2--;
		}
		if (m2 < 0) {
			m2 += 60;
			h2--;
		}
		if (h2 < 0) {
			h2 += 24;
		}

		if (h2 == 0 && m2 == 0 && s2 == 0) {
			h2 = 24;
		}

		System.out.printf("%02d:%02d:%02d", h2, m2, s2);
	}

}
