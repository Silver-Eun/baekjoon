package Bronze_III;

import java.util.Scanner;

public class ex28214 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int P = sc.nextInt();

		int cnt = 0;

		for (int i = 0; i < N; i++) {
			int cream = 0;
			for (int j = 0; j < K; j++) {
				int bread = sc.nextInt();

				if (bread == 0)
					cream++;
			}
			if (P <= cream)
				cnt++;
		}

		System.out.println(N - cnt);
		
		sc.close();
	}

}
