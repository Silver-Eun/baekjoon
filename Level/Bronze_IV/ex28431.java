package Bronze_IV;

import java.util.Scanner;

public class ex28431 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();
		int i;
		for (i = 0; i < 5; i++) {
			int count = 0;
			for (int j = 0; j < 5; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count % 2 == 1)
				break;
		}
		System.out.println(arr[i]);
	}

}
