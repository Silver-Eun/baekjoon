package Bronze_III;

import java.util.Scanner;

public class ex17496 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.nextLine();

		String[] B = A.split(" ");

		int N = Integer.valueOf(B[0]);
		int T = Integer.valueOf(B[1]);
		int C = Integer.valueOf(B[2]);
		int P = Integer.valueOf(B[3]);

		int sum = 0;

		if (N % T == 0) {
			sum = (N / T - 1) * C * P;
		} else {
			sum = (N / T) * C * P;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
