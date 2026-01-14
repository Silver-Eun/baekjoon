package Bronze_II;

import java.util.Scanner;

public class ex01712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();

		if (C <= B) {
			System.out.println(-1);
		} else {
			long result = A / (C - B) + 1;
			System.out.println(result);
		}

		sc.close();

	}

}
