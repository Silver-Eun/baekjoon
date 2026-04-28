package Bronze_II;

import java.util.Scanner;

public class ex01408 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		String b = sc.nextLine();

		String[] A = a.split(":");
		String[] B = b.split(":");

		int h = 3600 * Integer.parseInt(A[0]) + 60 * Integer.parseInt(A[1]) + Integer.parseInt(A[2]);
		int s = 3600 * Integer.parseInt(B[0]) + 60 * Integer.parseInt(B[1]) + Integer.parseInt(B[2]);

		int r = s - h;
		if (r < 0)
			r += 24 * 3600;

		int hh = r / 3600;
		int mm = (r % 3600) / 60;
		int ss = (r % 3600) % 60;

		System.out.printf("%02d:%02d:%02d", hh, mm, ss);

		sc.close();
	}

}
