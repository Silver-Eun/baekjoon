package Bronze_III;

import java.util.Scanner;

public class ex32193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] h = new int[N];

		int A = sc.nextInt();
		int B = sc.nextInt();
		h[0] = A - B;

		for (int i = 1; i < N; i++) {
			A = sc.nextInt();
			B = sc.nextInt();

			h[i] = h[i - 1] + (A - B);
		}

		for (int i = 0; i < N; i++) {
			System.out.println(h[i]);
		}

		sc.close();
	}

}
