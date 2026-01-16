package Bronze_II;

import java.util.Scanner;

public class ex01731 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] a = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		if (a[2] - a[1] == a[1] - a[0])
			System.out.println(a[N - 1] + a[1] - a[0]);
		else if (a[2] / a[1] == a[1] / a[0])
			System.out.println(a[N - 1] * (a[1] / a[0]));

		sc.close();
	}

}
