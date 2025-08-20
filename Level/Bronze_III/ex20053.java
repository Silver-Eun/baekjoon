package Bronze_III;

import java.util.Scanner;

public class ex20053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int j = 0; j < T; j++) {
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;

			int N = sc.nextInt();
			
			sc.nextLine();
			
			String A = sc.nextLine();
			String[] B = A.split(" ");
			int[] C = new int[N];

			for (int i = 0; i < B.length; i++) {
				C[i] = Integer.parseInt(B[i]);
			}

			for (int i = 0; i < C.length; i++) {
				if (C[i] < min) {
					min = C[i];
				}
			}

			for (int i = 0; i < C.length; i++) {
				if (max < C[i]) {
					max = C[i];
				}
			}

			System.out.println(min + " " + max);
		}
		
		sc.close();
	}

}
