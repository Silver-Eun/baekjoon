package Bronze_III;

import java.util.Scanner;

public class ex01598 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] A = sc.nextLine().split(" ");
		int a = Integer.parseInt(A[0]) - 1;
		int b = Integer.parseInt(A[1]) - 1;

		sc.close();

		int N = Math.abs((a / 4) - (b / 4));
		int M = Math.abs((a % 4) - (b % 4));

		System.out.println(N + M);
	}

}
