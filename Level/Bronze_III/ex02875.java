package Bronze_III;

import java.util.Scanner;

public class ex02875 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] a = sc.nextLine().split(" ");

		int N = Integer.parseInt(a[0]);
		int M = Integer.parseInt(a[1]);
		int K = Integer.parseInt(a[2]);

		sc.close();

		int max = Math.min(N / 2, M);

		int remain = N + M - K;

		while (max * 3 > remain) {
			max--;
		}

		System.out.println(max);
	}

}
