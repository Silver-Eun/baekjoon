package step04;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] arr = new int[N];

		int M = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < M; i++) {

			int tmp = 0;

			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;

			while (a < b) {
				tmp = arr[a];
				arr[a++] = arr[b];
				arr[b--] = tmp;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();

	}

}
