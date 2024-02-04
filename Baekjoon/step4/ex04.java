package step4;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[8];

		int max = arr[0];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (max < arr[i]) {
				max = arr[i];
				count = i + 1;
			}
		}
		sc.close();
		
		System.out.println(max);
		System.out.println(count);
	}

}
