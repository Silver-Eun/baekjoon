package Bronze_III;

import java.util.Scanner;

public class ex17945 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.nextLine();

		String[] B = A.split(" ");

		int a = Integer.valueOf(B[0]);
		int b = Integer.valueOf(B[1]);

		double c = Math.sqrt(a * a - b);

		int d = -a + (int) c;
		int e = -a - (int) c;

		if (e == d) {
			System.out.println(d);
		} else if (e > d) {
			System.out.println(d + " " + e);
		} else {
			System.out.println(e + " " + d);
		}

		sc.close();
	}

}
