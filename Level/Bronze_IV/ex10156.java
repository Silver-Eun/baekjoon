package Bronze_IV;

import java.util.Scanner;

public class ex10156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		int N = sc.nextInt();
		int M = sc.nextInt();

		sc.close();

		int result = K * N - M;

		if (result < 0)
			System.out.println(0);
		else
			System.out.println(result);
	}

}
