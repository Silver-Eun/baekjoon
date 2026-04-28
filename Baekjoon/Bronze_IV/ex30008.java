package Bronze_IV;

import java.util.Scanner;

public class ex30008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] arr = new int[K];

		int a = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			a = (arr[i] * 100) / N;
			if (96 < a)
				System.out.println(9);
			else if (89 < a)
				System.out.println(8);
			else if (77 < a)
				System.out.println(7);
			else if (60 < a)
				System.out.println(6);
			else if (40 < a)
				System.out.println(5);
			else if (23 < a)
				System.out.println(4);
			else if (11 < a)
				System.out.println(3);
			else if (4 < a)
				System.out.println(2);
			else if (0 <= a)
				System.out.println(1);
		}

		sc.close();
	}

}
