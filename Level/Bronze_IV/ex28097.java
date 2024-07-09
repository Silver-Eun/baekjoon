package Bronze_IV;

import java.util.Scanner;

public class ex28097 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] arr = new int[N];

		int a = 0;
		int H = 0;
		int M = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			a += arr[i];
		}

		sc.close();

		a += 8 * (N - 1);

		H = a / 24;
		M = a % 24;

		System.out.println(H + " " + M);
	}

}
