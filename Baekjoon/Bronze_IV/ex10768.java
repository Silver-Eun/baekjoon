package Bronze_IV;

import java.util.Scanner;

public class ex10768 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int D = sc.nextInt();

		sc.close();

		if ((M < 13 && 0 < M) && (0 < D && D < 32)) {
			if (M < 2)
				System.out.println("Before");
			else if (M == 2) {
				if (D < 18)
					System.out.println("Before");
				else if (D > 18)
					System.out.println("After");
				else
					System.out.println("Special");
			} else
				System.out.println("After");
		}
	}
}
