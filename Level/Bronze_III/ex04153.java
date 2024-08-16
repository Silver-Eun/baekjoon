package Bronze_III;

import java.util.Arrays;
import java.util.Scanner;

public class ex04153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String[] A = sc.nextLine().split(" ");

			int a = Integer.parseInt(A[0]);
			int b = Integer.parseInt(A[1]);
			int c = Integer.parseInt(A[2]);

			if (a == 0 && b == 0 && c == 0)
				break;
			
			int[] arr = {a, b, c};
			
			Arrays.sort(arr);

			if ((arr[0] * arr[0] + arr[1] * arr[1]) == (arr[2] * arr[2])) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}

		sc.close();
	}

}
