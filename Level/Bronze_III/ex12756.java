package Bronze_III;

import java.util.Scanner;

public class ex12756 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A1 = sc.nextInt();
		int A2 = sc.nextInt();
		int B1 = sc.nextInt();
		int B2 = sc.nextInt();

		while (0 < A2 && 0 < B2) {
			A2 -= B1;
			B2 -= A1;
		}

		if (A2 > B2) {
			System.out.println("PLAYER A");
		} else if (A2 == B2) {
			System.out.println("DRAW");
		} else {
			System.out.println("PLAYER B");
		}

		sc.close();
	}

}
