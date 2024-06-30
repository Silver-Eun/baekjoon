package Bronze_IV;

import java.util.Scanner;

public class ex13118 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[4];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int X = sc.nextInt();
		int Y = sc.nextInt();
		int R = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if ((Y - R) >= (X - Math.abs(arr[i]))) {
				System.out.println(i + 1);
			}
		}

		sc.close();

	}

}
