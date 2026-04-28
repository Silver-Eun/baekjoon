package Bronze_IV;

import java.util.Scanner;

public class ex10039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] < 40)
				arr[i] = 40;
			sum += arr[i];
		}
		sc.close();

		System.out.println(sum / 5);
	}

}
