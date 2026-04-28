package Bronze_III;

import java.util.Scanner;

public class ex05691 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String[] a = sc.nextLine().split(" ");

			int A = Integer.parseInt(a[0]);
			int B = Integer.parseInt(a[1]);

			if (A == 0 & B == 0)
				break;

			int C = 2 * B - A;
			
            System.out.println(C);
		}

		sc.close();
	}

}
