package Bronze_III;

import java.util.Scanner;

public class ex23794 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N + 2; i++) {
			System.out.print("@");
		}

		System.out.println();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N + 2; j++) {
				if (j == 0 || j == N + 1)
					System.out.print("@");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		for (int i = 0; i < N + 2; i++) {
			System.out.print("@");
		}
		
		sc.close();
	}

}
