package Bronze_III;

import java.util.Scanner;

public class ex23348 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.nextLine();
		String[] B = A.split(" ");
		int a = Integer.valueOf(B[0]);
		int b = Integer.valueOf(B[1]);
		int c = Integer.valueOf(B[2]);

		int N = sc.nextInt();

		int[] F = new int[N];
		int max = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				int C = sc.nextInt();
				int D = sc.nextInt();
				int E = sc.nextInt();
				
				F[i] += C * a + D * b + E * c;
			}
			if (F[i] > max)
				max = F[i];
		}

		System.out.println(max);

		sc.close();
	}

}
