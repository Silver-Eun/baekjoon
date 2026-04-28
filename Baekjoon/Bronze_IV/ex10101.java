package Bronze_IV;

import java.util.Scanner;

public class ex10101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		if (A + B + C != 180) {
			System.out.println("Error");
		} else if (A == 60 && B == 60 && C == 60) {
			System.out.println("Equilateral");
		} else if (A == B || A == C || B == C) {
			System.out.println("Isosceles");
		} else {
			System.out.println("Scalene");
		}

		sc.close();
	}

}
