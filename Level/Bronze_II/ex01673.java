package Bronze_II;

import java.util.Scanner;

public class ex01673 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			long n = sc.nextLong();
			long k = sc.nextLong();

			long result = n + (n - 1) / (k - 1);

			System.out.println(result);
		}
	}

}
