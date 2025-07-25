package Bronze_III;

import java.util.Scanner;

public class ex14656 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = 0;

		int[] A = new int[a];

		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}

		for (int i = 0; i < A.length; i++) {
			if (A[i] != i + 1) {
				b++;
			}
		}
		
		sc.close();

		System.out.println(b);
	}

}
