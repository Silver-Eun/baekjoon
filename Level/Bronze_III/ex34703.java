package Bronze_III;

import java.util.Scanner;

public class ex34703 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] day = new int[6];

		for (int i = 0; i < N; i++) {
			int t = sc.nextInt();
			day[t] = 1;
		}

		boolean hasEmpty = false;
		for (int i = 1; i <= 5; i++) {
			if (day[i] == 0)
				hasEmpty = true;
		}

		if (hasEmpty)
			System.out.println("YES");
		else
			System.out.println("NO");

		sc.close();
	}

}
