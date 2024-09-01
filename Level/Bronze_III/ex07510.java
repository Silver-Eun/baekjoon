package Bronze_III;

import java.util.Arrays;
import java.util.Scanner;

public class ex07510 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < N; i++) {
			String[] A = sc.nextLine().split(" ");

			int a = Integer.parseInt(A[0]);
			int b = Integer.parseInt(A[1]);
			int c = Integer.parseInt(A[2]);

			int[] arr = { a, b, c };

			Arrays.sort(arr);

			System.out.println("Scenario #" + (i + 1) + ":");

			if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			System.out.println();
		}
	}

}
