package Bronze_IV;

import java.util.Scanner;

public class ex17388 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int S = sc.nextInt();
		int K = sc.nextInt();
		int H = sc.nextInt();

		int a = S + K + H;
		int min = 0;
		sc.close();

		if (a >= 100) {
			System.out.println("OK");
		} else {
			min = Math.min(Math.min(S, K), H);
			if (min == S) {
				System.out.println("Soongsil");
			} else if (min == K) {
				System.out.println("Korea");
			} else if (min == H) {
				System.out.println("Hanyang");
			}
		}
	}

}
