package Bronze_III;

import java.util.Scanner;

public class ex16479 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		int D1 = sc.nextInt();
		int D2 = sc.nextInt();

		int H = 0;

		H = K * K - ((D1 - D2) / 2) * ((D1 - D2) / 2);

		System.out.println(H);

		sc.close();
	}

}
