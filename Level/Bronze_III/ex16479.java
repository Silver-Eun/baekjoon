package Bronze_III;

import java.util.Scanner;

public class ex16479 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double K = sc.nextDouble();
		double D1 = sc.nextDouble();
		double D2 = sc.nextDouble();

		double diff = (D1 - D2) / 2.0;
		double result = K * K - diff * diff;

		System.out.printf("%.10f\n", result);

		sc.close();
	}

}
