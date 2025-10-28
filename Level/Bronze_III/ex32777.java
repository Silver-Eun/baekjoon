package Bronze_III;

import java.util.Scanner;

public class ex32777 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Q = sc.nextInt();

		for (int i = 0; i < Q; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			int inner = (B - A + 43) % 43;
			int outer = (A - B + 43) % 43;

			if (inner < outer)
				System.out.println("Inner circle line");
			else if (outer < inner)
				System.out.println("Outer circle line");
			else
				System.out.println("Same");
		}

		sc.close();
	}

}
