package Bronze_III;

import java.util.Scanner;

public class ex20361 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.nextLine();

		String[] B = A.split(" ");

		int N = Integer.valueOf(B[0]);
		int X = Integer.valueOf(B[1]);
		int K = Integer.valueOf(B[2]);

		for (int i = 0; i < K; i++) {
			String C = sc.nextLine();
			String[] D = C.split(" ");

			int E = Integer.valueOf(D[0]);
			int F = Integer.valueOf(D[1]);

			if (E == X) {
				X = F;
			} else if (F == X) {
				X = E;
			}
		}
		
		System.out.println(X);
		
		sc.close();
	}

}
