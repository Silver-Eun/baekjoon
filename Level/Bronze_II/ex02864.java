package Bronze_II;

import java.util.Scanner;

public class ex02864 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();
		
		String[] C = S.split(" ");
		
		String A = C[0];
		String B = C[1];

		A = A.replace("6", "5");
		B = B.replace("6", "5");

		int a = Integer.parseInt(A) + Integer.parseInt(B);

		A = A.replace("5", "6");
		B = B.replace("5", "6");

		int b = Integer.parseInt(A) + Integer.parseInt(B);

		System.out.println(a <= b ? a + " " + b : b + " " + a);

		sc.close();
	}

}
