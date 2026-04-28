package Bronze_III;

import java.util.Scanner;

public class ex11966 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();

		while (N % 2 == 0) {
			N = N / 2;
		}

		if (N == 1) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

		sc.close();
	}

}
