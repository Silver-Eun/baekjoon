package Bronze_IV;

import java.util.Scanner;

public class ex27110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		sc.close();

		int sum = 0;

		if (A <= N) {
			sum += A;
		} else {
			sum += N;
		}

		if (B <= N) {
			sum += B;
		} else {
			sum += N;
		}

		if (C <= N) {
			sum += C;
		} else {
			sum += N;
		}

		System.out.println(sum);
	}

}
