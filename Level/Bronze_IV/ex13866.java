package Bronze_IV;

import java.util.Scanner;

public class ex13866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[4];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int MIN = (arr[0]+arr[3])-(arr[1]+arr[2]);
				
		System.out.println(Math.abs(MIN));
	}

}
