package Bronze_IV;

import java.util.Scanner;

public class ex28295 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int total = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}

		sc.close();

		if (total % 4 == 0) {
			System.out.println("N");
		} else if (total % 4 == 1) {
			System.out.println("E");
		} else if (total % 4 == 2) {
			System.out.println("S");
		} else if (total % 4 == 3) {
			System.out.println("W");
		}
	}

}
