package Bronze_II;

import java.util.Scanner;

public class ex01434 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int box = 0;
		int book = 0;

		for (int i = 0; i < N; i++) {
			box += sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			book += sc.nextInt();
		}

		System.out.println(box - book);

		sc.close();
	}

}
