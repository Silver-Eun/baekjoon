package Bronze_IV;

import java.util.Scanner;

public class ex05596 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr1 = new int[4];
		int[] arr2 = new int[4];

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
			sum1 += arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
			sum2 += arr2[i];
		}
		
		sc.close();

		if (sum1 < sum2) {
			System.out.println(sum2);
		} else {
			System.out.println(sum1);
		}
	}

}
