package Bronze_III;

import java.util.Scanner;

public class ex34758 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (X == x || Y == y)
				System.out.println(0);
			else
				System.out.println(1);
		}

		sc.close();
	}

}
