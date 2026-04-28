package Bronze_III;

import java.util.Scanner;

public class ex10833 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = 0;

		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			M += B % A;
		}
		
		System.out.println(M);
		
		sc.close();
	}

}
