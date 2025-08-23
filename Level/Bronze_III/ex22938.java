package Bronze_III;

import java.util.Scanner;

public class ex22938 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.nextLine();
		String B = sc.nextLine();

		String[] C = A.split(" ");
		String[] D = B.split(" ");

		int x1 = Integer.valueOf(C[0]);
		int y1 = Integer.valueOf(C[1]);
		int r1 = Integer.valueOf(C[2]);

		int x2 = Integer.valueOf(D[0]);
		int y2 = Integer.valueOf(D[1]);
		int r2 = Integer.valueOf(D[2]);

		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		if (distance < r1 + r2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		sc.close();
	}

}
