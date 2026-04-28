package Bronze_III;

import java.util.Scanner;

public class ex31833 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		sc.nextLine();

		String A = sc.nextLine();
		String[] a = A.split(" ");
		String B = sc.nextLine();
		String[] b = B.split(" ");

		String x = "";
		String y = "";

		for (int i = 0; i < N; i++) {
			x += a[i];
			y += b[i];
		}

		System.out.println(Long.valueOf(y) <= Long.valueOf(x) ? y : x);

		sc.close();
	}

}
