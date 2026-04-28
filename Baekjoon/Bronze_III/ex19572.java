package Bronze_III;

import java.util.Scanner;

public class ex19572 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.nextLine();
		String[] B = A.split(" ");

		double d1 = Double.valueOf(B[0]);
		double d2 = Double.valueOf(B[1]);
		double d3 = Double.valueOf(B[2]);

		double b = (d1 - d2 + d3) / 2;
		double a = d1 - b;
		double c = d3 - b;

		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println(-1);
		} else {
			System.out.println(1);
			System.out.println(a + " " + b + " " + c);
		}

		sc.close();
	}

}
