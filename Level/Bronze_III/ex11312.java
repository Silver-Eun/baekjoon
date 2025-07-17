package Bronze_III;

import java.util.Scanner;

public class ex11312 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Long T = sc.nextLong();

		for (int i = 0; i < T; i++) {
			Long A = sc.nextLong();
			Long B = sc.nextLong();

			System.out.println((A * A) / (B * B));
		}

		sc.close();
	}

}