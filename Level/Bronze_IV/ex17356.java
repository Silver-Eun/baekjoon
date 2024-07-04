package Bronze_IV;

import java.util.Scanner;

public class ex17356 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();

		double M = (B - A) / 400;

		double N = 1 / (1 + Math.pow(10, M));

		System.out.println(N);
	}

}
