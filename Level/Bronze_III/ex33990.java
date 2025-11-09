package Bronze_III;

import java.util.Scanner;

public class ex33990 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		int result = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();

			int total = A + B + C;

			if (total >= 512 && total < result) {
				result = total;
			}
		}

		if (result == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(result);
		}

		sc.close();
	}

}
