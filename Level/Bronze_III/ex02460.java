package Bronze_III;

import java.util.Scanner;

public class ex02460 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = 0;
		int M = 0;
		int a = 0;
		int max = 0;

		for (int i = 0; i < 10; i++) {
			String[] A = sc.nextLine().split(" ");
			N = Integer.parseInt(A[0]);
			M = Integer.parseInt(A[1]);

			a += M - N;

			if (max < a)
				max = a;
		}

		sc.close();

		System.out.println(max);
	}

}
