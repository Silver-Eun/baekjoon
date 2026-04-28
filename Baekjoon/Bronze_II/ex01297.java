package Bronze_II;

import java.util.Scanner;

public class ex01297 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int D = sc.nextInt();
		int H = sc.nextInt();
		int W = sc.nextInt();

		double k = D / Math.sqrt(H * H + W * W);

		int realH = (int) (k * H);
		int realW = (int) (k * W);

		System.out.println(realH + " " + realW);

		sc.close();
	}

}
