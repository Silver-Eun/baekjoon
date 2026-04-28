package Bronze_IV;

import java.util.Scanner;

public class ex29807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		int[] arr = new int[5];
		for (int i = 0; i < T; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();

		int a = 0;
		int b = 0;
		int c = 0;

		if (arr[0] > arr[2]) {
			a = (arr[0] - arr[2]) * 508;
		} else {
			a = (arr[2] - arr[0]) * 108;
		}

		if (arr[1] > arr[3]) {
			b = (arr[1] - arr[3]) * 212;
		} else {
			b = (arr[3] - arr[1]) * 305;
		}

		if (T == 5) {
			c = arr[4] * 707;
		}

		int total = a + b + c;

		System.out.println(total * 4763);
	}
}
