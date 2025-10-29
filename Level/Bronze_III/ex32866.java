package Bronze_III;

import java.util.Scanner;

public class ex32866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Double N = sc.nextDouble();
		Double X = sc.nextDouble();

		Double A = (100 * X) / (100 - X);

		System.out.printf("%.6f", A);

		sc.close();
	}

}