package Bronze_III;

import java.util.Scanner;

public class ex03460 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();

			int position = 0;

			while (n > 0) {
				if ((n & 1) == 1) {
					System.out.print(position + " ");
				}
				n >>= 1;
				position++;
			}
			System.out.println();
		}
		sc.close();
	}

}
