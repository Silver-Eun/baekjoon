package Bronze_III;

import java.util.Scanner;

public class ex01547 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = { 1, 0, 0 };

		int M = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < M; i++) {
			String[] A = sc.nextLine().split(" ");
			int a = Integer.parseInt(A[0]);
			int b = Integer.parseInt(A[1]);

			int temp;

			temp = arr[b - 1];
			arr[b - 1] = arr[a - 1];
			arr[a - 1] = temp;
		}

		sc.close();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				System.out.println(i + 1);
				break;
			}
		}
	}

}
