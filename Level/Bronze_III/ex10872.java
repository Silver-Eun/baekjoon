package Bronze_III;

import java.util.Scanner;

public class ex10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Long N = sc.nextLong();

		int A = 1;

		for (int i = 1; i <= N; i++) {
			A *= i;
		}
		
		System.out.println(A);
		
		sc.close();
	}

}
