package Bronze_III;

import java.util.Arrays;
import java.util.Scanner;

public class ex02959 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[4];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();

		Arrays.sort(arr);

		System.out.println(arr[0] * arr[2]);
	}

}