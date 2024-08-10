package Bronze_III;

import java.util.Scanner;

public class ex02863 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] a = sc.nextLine().split(" ");
		int A = Integer.parseInt(a[0]);
		int B = Integer.parseInt(a[1]);

		String[] b = sc.nextLine().split(" ");
		int C = Integer.parseInt(b[0]);
		int D = Integer.parseInt(b[1]);

		sc.close();

		double[] values = new double[4];

		values[0] = (double) A / C + (double) B / D;
		values[1] = (double) C / D + (double) A / B;
		values[2] = (double) D / B + (double) C / A;
		values[3] = (double) B / A + (double) D / C;

		int maxIndex = 0;
		for (int i = 1; i < 4; i++) {
			if (values[i] > values[maxIndex]) {
				maxIndex = i;
			}
		}
		System.out.println(maxIndex);
	}

}
