package Bronze_III;

import java.util.Scanner;

public class ex02522 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		sc.close();

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				System.out.print(" ");
			}
			for (int j = N - i - 1; j < N; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < N; i++) {
			for (int j = N - i - 1; j < N; j++) {
				System.out.print(" ");
			}
			for (int j = i + 1; j < N; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
