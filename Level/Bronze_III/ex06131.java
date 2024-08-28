package Bronze_III;

import java.util.Scanner;

public class ex06131 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int cnt = 0;

		for (int B = 1; B <= 500; B++) {
			for (int A = B; A <= 500; A++) {
				if (A * A == B * B + N) {
					cnt++;
				}
			}
		}

		sc.close();

		System.out.println(cnt);
	}

}
