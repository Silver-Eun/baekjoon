package Bronze_III;

import java.util.Arrays;
import java.util.Scanner;

public class ex09366 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < T; i++) {
			String[] A = sc.nextLine().split(" ");

			int a = Integer.parseInt(A[0]);
			int b = Integer.parseInt(A[1]);
			int c = Integer.parseInt(A[2]);

			System.out.print("Case #" + (i + 1) + ": ");

			int[] arr = { a, b, c };

			Arrays.sort(arr);

			if (arr[0] + arr[1] <= arr[2]) {
				System.out.println("invalid!");
			} else {
				if (a == b && b == c) {
					System.out.println("equilateral");
				} else if (a == b || a == c || b == c) {
					System.out.println("isosceles");
				} else if (a != b && b != c && a != c) {
					System.out.println("scalene");
				}
			}
		}

		sc.close();
	}

}
