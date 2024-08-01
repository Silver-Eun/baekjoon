package Bronze_III;

import java.util.Scanner;

public class ex02442 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		sc.close();

		for (int i = 0; i < N; i++) {
			for (int j = (N - i); j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 2 * (N - i - 1); j <= 2 * (N - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
