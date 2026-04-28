package Bronze_IV;

import java.util.Scanner;

public class ex05543 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();

		int[] arr = new int[6];

		arr[0] = a + d - 50;
		arr[1] = a + e - 50;
		arr[2] = b + d - 50;
		arr[3] = b + e - 50;
		arr[4] = c + d - 50;
		arr[5] = c + e - 50;

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}

		System.out.println(min);
		sc.close();
	}

}
