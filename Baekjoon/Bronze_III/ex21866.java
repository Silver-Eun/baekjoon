package Bronze_III;

import java.util.Scanner;

public class ex21866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] maxScores = { 100, 100, 200, 200, 300, 300, 400, 400, 500 };
		boolean hacker = false;

		String A = sc.nextLine();
		String[] B = A.split(" ");

		int sum = 0;

		for (int i = 0; i < B.length; i++) {
			sum += Integer.valueOf(B[i]);
			if (Integer.valueOf(B[i]) > maxScores[i]) {
				hacker = true;
			}
		}

		if (hacker) {
			System.out.println("hacker");
		} else if (sum >= 100) {
			System.out.println("draw");
		} else {
			System.out.println("none");
		}

		sc.close();
	}

}
