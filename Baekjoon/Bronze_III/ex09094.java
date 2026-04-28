package Bronze_III;

import java.util.Scanner;

public class ex09094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		
		sc.nextLine();

		for (int i = 0; i < T; i++) {
			String[] A = sc.nextLine().split(" ");

			int n = Integer.parseInt(A[0]);
			int m = Integer.parseInt(A[1]);
			int cnt = 0;

			for (int b = 2; b < n; b++) {
				for (int a = 1; a < b; a++) {
					double test = (double) (a * a + b * b + m) / (a * b);
					if (test - (int) test == 0.0) {
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
		sc.close();
	}

}
