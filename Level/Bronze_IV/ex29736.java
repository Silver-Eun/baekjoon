package Bronze_IV;

import java.util.Scanner;

public class ex29736 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		int X = sc.nextInt();

		sc.close();

		int min = 0;
		int max = 0;

		if (A < (K - X))
			min = (K - X);
		else
			min = A;

		if (B < (K + X))
			max = B;
		else
			max = (K + X);

		if ((max - min + 1) <= 0)
			System.out.println("IMPOSSIBLE");
		else
			System.out.println(max - min + 1);
	}

}
