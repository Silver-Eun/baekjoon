package Bronze_III;

import java.util.Scanner;

public class ex30802 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int S = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		int XL = sc.nextInt();
		int XXL = sc.nextInt();
		int XXXL = sc.nextInt();

		int[] arr = { S, M, L, XL, XXL, XXXL };

		int T = sc.nextInt();
		int P = sc.nextInt();

		int t = 0;
		int p = 0;
		int s = 0;

		for (int i = 0; i < arr.length; i++) {
			t += (arr[i] + T - 1) / T;
		}

		p = N / P;
		s = N % P;

		System.out.println(t);
		System.out.println(p + " " + s);

		sc.close();
	}

}
