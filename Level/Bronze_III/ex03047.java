package Bronze_III;

import java.util.Arrays;
import java.util.Scanner;

public class ex03047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] a = sc.nextLine().split(" ");
		String b = sc.next();

		int M = Integer.parseInt(a[0]);
		int N = Integer.parseInt(a[1]);
		int O = Integer.parseInt(a[2]);

		int[] A = { M, N, O };

		Arrays.sort(A);

		M = A[0];
		N = A[1];
		O = A[2];

		if (b.equals("ABC")) {
			System.out.println(M + " " + N + " " + O);
		} else if (b.equals("ACB")) {
			System.out.println(M + " " + O + " " + N);
		} else if (b.equals("BAC")) {
			System.out.println(O + " " + M + " " + N);
		} else if (b.equals("BCA")) {
			System.out.println(N + " " + O + " " + M);
		} else if (b.equals("CBA")) {
			System.out.println(O + " " + N + " " + M);
		} else if (b.equals("CAB")) {
			System.out.println(O + " " + M + " " + N);
		}

		sc.close();
	}

}
