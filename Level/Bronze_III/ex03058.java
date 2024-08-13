package Bronze_III;

import java.util.Scanner;

public class ex03058 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		sc.nextLine();


		for (int i = 0; i < N; i++) {
			int sum = 0;
			int min = 100;
			String[] a = sc.nextLine().split(" ");

			for (int j = 0; j < 7; j++) {
				int A = Integer.parseInt(a[j]);
				if (A % 2 == 0) {
					sum += A;

					if (A < min) {
						min = A;
					}
				}
			}
			
			System.out.println(sum + " " + min);
		}
	}

}
