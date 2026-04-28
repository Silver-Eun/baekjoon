package Bronze_II;

import java.util.Scanner;

public class ex01964 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		long a = 5;

		if (N != 1) {
			for (int i = 2; i <= N; i++) {
				a += (i * 3 + 1);
			}
		}

		System.out.println(a % 45678);
		
		sc.close();
	}

}
