package Bronze_II;

import java.util.Arrays;
import java.util.Scanner;

public class ex02399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		long[] a = new long[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}

		Arrays.sort(a);

		long sum = 0;
		long prefix = 0;

		for (int i = 0; i < n; i++) {
			sum += a[i] * i - prefix;
			prefix += a[i];
		}

		System.out.println(sum * 2);

		sc.close();
	}

}
