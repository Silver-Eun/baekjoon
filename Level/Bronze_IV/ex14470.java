package Bronze_IV;

import java.util.Scanner;

public class ex14470 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();

		sc.close();

		int time = 0;

		if (A < 0) {
			time += Math.abs(0 - A) * C;
			time += D;
			time += B * E;
		} else if (A == 0) {
			time += D;
			time += B * E;
		} else if (0 < A) {
			time += (B - A) * E;
		}

		System.out.println(time);
	}

}
