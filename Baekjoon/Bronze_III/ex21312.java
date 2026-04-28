package Bronze_III;

import java.util.Scanner;

public class ex21312 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}

		int maxOdd = -1;
		int maxEven = -1;

		for (int i = 0; i < 3; i++) {
			if (arr[i] % 2 == 1)
				maxOdd = Math.max(maxOdd, arr[i]);
			else
				maxEven = Math.max(maxEven, arr[i]);
		}

		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 3; j++) {
				int prod = arr[i] * arr[j];
				if (prod % 2 == 1)
					maxOdd = Math.max(maxOdd, prod);
				else
					maxEven = Math.max(maxEven, prod);
			}
		}

		int prodAll = arr[0] * arr[1] * arr[2];
		if (prodAll % 2 == 1)
			maxOdd = Math.max(maxOdd, prodAll);
		else
			maxEven = Math.max(maxEven, prodAll);

		System.out.println(maxOdd != -1 ? maxOdd : maxEven);

		sc.close();
	}

}
