package Bronze_III;

import java.util.Scanner;

public class ex25904 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.nextLine();
		String[] B = A.split(" ");

		int N = Integer.valueOf(B[0]);
		int X = Integer.valueOf(B[1]);

		String C = sc.nextLine();
		String[] D = C.split(" ");

		sc.close();
		
		while (true) {
			for (int i = 0; i < N; i++) {
				if (Integer.valueOf(D[i]) < X) {
					System.out.println(i + 1);
					return;
				}
				X++;
			}
		}
	}

}
