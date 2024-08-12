package Bronze_III;

import java.util.Arrays;
import java.util.Scanner;

public class ex02997 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] a = sc.nextLine().split(" ");

		int A = Integer.parseInt(a[0]);
		int B = Integer.parseInt(a[1]);
		int C = Integer.parseInt(a[2]);

		sc.close();

		int[] arr = { A, B, C };

		Arrays.sort(arr);

		if (arr[1] - arr[0] == arr[2] - arr[1]) {
			System.out.println(arr[2] + (arr[1] - arr[0]));
		} else if (arr[1] - arr[0] != arr[2] - arr[1]) {
			if (arr[1] - arr[0] < arr[2] - arr[1]) {
				System.out.println(arr[2] - (arr[1] - arr[0]));
			} else {
				System.out.println(arr[0] + (arr[2] - arr[1]));
			}
		}
	}

}
