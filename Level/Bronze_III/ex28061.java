package Bronze_III;

import java.util.Scanner;

public class ex28061 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] arr = new long[N];
		long max = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if (max < arr[i] - (N - i)) {
				max = arr[i] - (N - i);
			}
		}

		System.out.println(max);

		sc.close();
	}

}
