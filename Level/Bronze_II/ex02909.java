package Bronze_II;

import java.util.Scanner;

public class ex02909 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long C = sc.nextLong();
		int K = sc.nextInt();

		long unit = 1;
		for (int i = 0; i < K; i++) {
			unit *= 10;
		}

		long result = ((C + unit / 2) / unit) * unit;

		System.out.println(result);

		sc.close();
	}

}