package Bronze_III;

import java.util.Scanner;

public class ex23812 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println("@".repeat(N) + "   ".repeat(N) + "@".repeat(N) );
		}

		for (int i = 0; i < N; i++) {
			System.out.println("@".repeat(5 * N));
		}

		for (int i = 0; i < N; i++) {
			System.out.println("@".repeat(N) + "   ".repeat(N) + "@".repeat(N) );
		}

		for (int i = 0; i < N; i++) {
			System.out.println("@".repeat(5 * N));
		}

		for (int i = 0; i < N; i++) {
			System.out.println("@".repeat(N) + "   ".repeat(N) + "@".repeat(N) );
		}

		sc.close();
	}

}
