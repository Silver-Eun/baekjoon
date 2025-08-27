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

		int[] E = new int[N];
		int max = 0;

		for (int i = 0; i < N; i++) {
			int C = sc.nextInt();
			String[] D = C.split(" ");

			E[i] += Integer.valueOf(D[0]) * a + Integer.valueOf(D[1]) * b + Integer.valueOf(D[2]) * c;
		}

		for (int i = 0; i < E.length; i++) {
			if (E[i] > max)
				max = E[i];
		}

		System.out.println(max);
		
		sc.close();
	}

}
