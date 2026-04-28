package Bronze_II;

import java.util.Scanner;

public class ex02704 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < T; i++) {
			String s = sc.nextLine();

			String[] A = s.split(":");

			int a = Integer.parseInt(A[0]);
			int b = Integer.parseInt(A[1]);
			int c = Integer.parseInt(A[2]);

			String h = String.format("%6s", Integer.toBinaryString(a)).replace(' ', '0');
			String m = String.format("%6s", Integer.toBinaryString(b)).replace(' ', '0');
			String s2 = String.format("%6s", Integer.toBinaryString(c)).replace(' ', '0');

			String col = "";

			for (int j = 0; j < 6; j++) {
				col += h.charAt(j);
				col += m.charAt(j);
				col += s2.charAt(j);
			}

			String row = h + m + s2;

			System.out.println(col + " " + row);
		}

		sc.close();
	}

}
