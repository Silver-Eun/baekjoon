package Bronze_II;

import java.util.Scanner;

public class ex01350 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int F = 0;

		for (int i = 0; i < N; i++) {
			F += sc.nextInt();
		}

		int C = sc.nextInt();
		
		while(C < F) {
			C += C;
		}
		
		System.out.println(C);

		sc.close();
	}

}
