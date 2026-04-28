package Bronze_II;

import java.util.Scanner;

public class ex02979 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int[] time = new int[101];

		for (int i = 0; i < 3; i++) {

			int start = sc.nextInt();
			int end = sc.nextInt();

			for (int t = start; t < end; t++) {
				time[t]++;
			}
		}

		int sum = 0;

		for (int i = 1; i < 101; i++) {
			if (time[i] == 1)
				sum += A;
			if (time[i] == 2)
				sum += 2 * B;
			if (time[i] == 3)
				sum += 3 * C;
		}
		
		System.out.println(sum);

		sc.close();
	}

}
