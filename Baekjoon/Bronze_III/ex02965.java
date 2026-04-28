package Bronze_III;

import java.util.Scanner;

public class ex02965 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] a = sc.nextLine().split(" ");

		int A = Integer.parseInt(a[0]);
		int B = Integer.parseInt(a[1]);
		int C = Integer.parseInt(a[2]);

		sc.close();

		System.out.println(Math.max(B - A, C - B) - 1);
	}

}
