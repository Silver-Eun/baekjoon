package Bronze_II;

import java.util.Scanner;

public class ex02355 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();

		long sum = (Math.abs(B - A) + 1) * (A + B) / 2;

		System.out.println(sum);

		sc.close();
	}

}
