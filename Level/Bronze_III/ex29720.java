package Bronze_III;

import java.util.Scanner;

public class ex29720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();

		int min = N - M * K;
		int max = N - M * (K - 1) - 1;

		if (min < 0)
			min = 0;
		if (max < 0)
			max = 0;

		System.out.println(min + " " + max);

		sc.close();
	}

}
