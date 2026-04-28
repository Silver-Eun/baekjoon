package Bronze_III;

import java.util.Scanner;

public class ex05523 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int a = 0, b = 0;

		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			if (A > B)
				a++;
			else if (A < B)
				b++;
			
		}
		System.out.println(a + " " + b);
		
		sc.close();
	}

}
