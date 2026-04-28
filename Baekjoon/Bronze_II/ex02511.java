package Bronze_II;

import java.util.Scanner;

public class ex02511 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[10];
		int[] b = new int[10];

		int A = 0;
		int B = 0;

		char lastWinner = 'D';

		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			b[i] = sc.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			if (a[i] > b[i]) {
				A += 3;
				lastWinner = 'A';
			} else if (a[i] < b[i]) {
				B += 3;
				lastWinner = 'B';
			} else {
				A++;
				B++;
			}
		}

		System.out.println(A + " " + B);

		if (A > B)
		    System.out.println("A");
		else if (A < B)
		    System.out.println("B");
		else
		    System.out.println(lastWinner);

		sc.close();
	}

}
