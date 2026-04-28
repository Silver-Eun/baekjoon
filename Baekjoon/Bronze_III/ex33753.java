package Bronze_III;

import java.util.Scanner;

public class ex33753 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int T = sc.nextInt();

		int m = 0;

		if (T <= 30) {
			m = A;
		} else {
			int extraTime = T - 30;
			int count = (extraTime + B - 1) / B;
			m = A + count * C;
		}

		System.out.println(m);

		sc.close();
	}

}
