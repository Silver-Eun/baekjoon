package Bronze_III;

import java.util.Scanner;

public class ex15953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int prizeA = 0;
			int prizeB = 0;

			if (a != 0) {
				if (a == 1) {
					prizeA = 500;
				} else if (a <= 3) {
					prizeA = 300;
				} else if (a <= 6) {
					prizeA = 200;
				} else if (a <= 10) {
					prizeA = 50;
				} else if (a <= 15) {
					prizeA = 30;
				} else if (a <= 21) {
					prizeA = 10;
				}
			}

			if (b != 0) {
				if (b == 1) {
					prizeB = 512;
				} else if (b <= 3) {
					prizeB = 256;
				} else if (b <= 7) {
					prizeB = 128;
				} else if (b <= 15) {
					prizeB = 64;
				} else if (b <= 31) {
					prizeB = 32;
				}
			}
			System.out.println((prizeA + prizeB) * 10000);
		}

		sc.close();
	}

}
