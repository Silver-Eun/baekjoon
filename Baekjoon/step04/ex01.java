package step04;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int a = sc.nextInt();

		int[] arr = new int[a];

		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}

		int b = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == b) {
				count++;
			}
		}

		System.out.println(count);

		sc.close();
	}

}
