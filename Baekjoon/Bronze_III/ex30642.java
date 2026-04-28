package Bronze_III;

import java.util.Scanner;

public class ex30642 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();
		String S = sc.nextLine();
		int K = sc.nextInt();

		if (S.equals("annyong")) {
			if (K % 2 == 0) {
				if (K == N)
					System.out.println(K - 1);
				else
					System.out.println(K + 1);
			} else
				System.out.println(K);
		} else if (S.equals("induck")) {
			if (K % 2 == 0)
				System.out.println(K);
			else {
				if (K == N)
					System.out.println(K - 1);
				else
					System.out.println(K + 1);
			}
		}

		sc.close();
	}

}
