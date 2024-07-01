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

		boolean b = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == X) {
				System.out.println(i + 1);
				b = true;
			}
		}

		if (b == false) {
			System.out.print(0);
		}

		sc.close();

	}

}
