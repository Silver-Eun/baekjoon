package Bronze_IV;

import java.util.Scanner;

public class ex16199 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Y = sc.nextInt();
		int M = sc.nextInt();
		int D = sc.nextInt();

		int Y1 = sc.nextInt();
		int M1 = sc.nextInt();
		int D1 = sc.nextInt();

		sc.close();

		int man = 0;
		int se = 0;
		int yeon = 0;

		if (Y < Y1) {
			if (M1 < M) {
				man = Y1 - Y - 1;
				se = Y1 - Y + 1;
				yeon = Y1 - Y;
			} else if (M == M1) {
				if (D1 < D) {
					man = Y1 - Y - 1;
				} else if (D <= D1) {
					man = Y1 - Y;
				}
				se = Y1 - Y + 1;
				yeon = Y1 - Y;
			} else if (M < M1) {
				man = Y1 - Y;
				se = Y1 - Y + 1;
				yeon = Y1 - Y;
			}
		} else if (Y == Y1) {
			se = 1;
		}

		System.out.println(man);
		System.out.println(se);
		System.out.println(yeon);
	}

}
