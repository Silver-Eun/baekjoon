package Bronze_III;

import java.util.Scanner;

public class ex09517 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		int N = sc.nextInt();
		int time = 0;

		sc.nextLine();

		for (int i = 0; i < N; i++) {
			String[] a = sc.nextLine().split(" ");

			int T = Integer.parseInt(a[0]);
			String Z = a[1];

			time += T;

			if (time > 210)
				break;

			if (Z.equals("T"))
				K++;

			if (K == 9)
				K = 1;
		}
		sc.close();
		
		System.out.println(K);
	}

}
