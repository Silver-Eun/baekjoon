package Bronze_IV;

import java.util.Scanner;

public class ex10797 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] arr = new int[5];

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] == N)
				count++;
		}

		sc.close();

		System.out.println(count);
	}

}
