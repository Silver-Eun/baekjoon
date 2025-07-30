package Bronze_III;

import java.util.Scanner;

public class ex15667 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = 1;

		while (K * K + K < N - 1) {
			K++;
		}

		sc.close();

		System.out.println(K);
	}

}
