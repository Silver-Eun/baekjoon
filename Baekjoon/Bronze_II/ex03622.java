package Bronze_II;

import java.util.Scanner;

public class ex03622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int a = sc.nextInt();
		int B = sc.nextInt();
		int b = sc.nextInt();
		int P = sc.nextInt();

		if (A + B <= P || (Math.max(A, B) <= P && (A <= b || B <= a)))
			System.out.println("Yes");
		else
			System.out.println("No");

		sc.close();
	}

}
