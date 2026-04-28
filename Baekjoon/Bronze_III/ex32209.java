package Bronze_III;

import java.util.Scanner;

public class ex32209 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Q = sc.nextInt();

		int q = 0;
		boolean dissolved = false;

		for (int i = 0; i < Q; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (x == 1)
				q += y;
			else {
				if (q < y) {
					dissolved = true;
					break;
				}
				q -= y;
			}
		}

		System.out.println(dissolved ? "Adios" : "See you next month");

		sc.close();
	}

}
