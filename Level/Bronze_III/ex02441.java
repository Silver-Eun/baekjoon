package Bronze_III;

import java.util.Scanner;

public class ex02441 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			for (int j = i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < N - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
