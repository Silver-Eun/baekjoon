package Bronze_IV;

import java.util.Scanner;

public class ex30868 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] arr = new int[T];

		for (int i = 0; i < T; i++) {
			arr[i] = sc.nextInt();

			int a = arr[i] / 5;
			int b = arr[i] % 5;

			System.out.println();
			for (int j = 0; j < a; j++) {
				System.out.print("++++ ");
			}
			for (int j = 0; j < b; j++) {
				System.out.print("|");
			}
		}

		sc.close();

	}

}
