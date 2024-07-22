package Bronze_IV;

import java.util.Scanner;

public class ex31922 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] a = sc.nextLine().split(" ");
		int A = Integer.parseInt(a[0]);
		int P = Integer.parseInt(a[1]);
		int C = Integer.parseInt(a[2]);
		
		sc.close();

		int maxPrize = Math.max(A + C, P);

		System.out.println(maxPrize);
	}

}
