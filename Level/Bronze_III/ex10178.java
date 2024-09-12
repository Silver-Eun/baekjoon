package Bronze_III;

import java.util.Scanner;

public class ex10178 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < T; i++) {
			String[] a = sc.nextLine().split(" ");

			int c = Integer.parseInt(a[0]);
			int v = Integer.parseInt(a[1]);

			System.out.println("You get " + c / v + " piece(s) and your dad gets " + (c - v * (c / v)) + " piece(s).");
		}
		
		sc.close();
	}

}
