package Bronze_II;

import java.util.Scanner;

public class ex03040 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[9];
		int sum = 0;
		int a = 0;
		int b = 0;

		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();

			sum += arr[i];
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 1; j < 9; j++) {
				if (arr[i] + arr[j] == sum - 100) {
					a = i;
					b = j;
					break;
				}
			}
		}

		for (int i = 0; i < 9; i++) {
			if (i == a || i == b)
				continue;

			System.out.println(arr[i]);
		}

		sc.close();
	}

}
