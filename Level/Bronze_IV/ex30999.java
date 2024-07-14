package Bronze_IV;

import java.util.Scanner;

public class ex30999 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] A = sc.nextLine().split(" ");
		int N = Integer.parseInt(A[0]);
		int M = Integer.parseInt(A[1]);

		int majority = M / 2 + 1;
		int resultCount = 0;

		for (int i = 0; i < N; i++) {
			String vote = sc.nextLine();
			int countO = 0;

			for (int j = 0; j < M; j++) {
				if (vote.charAt(j) == 'O') {
					countO++;
				}
			}

			if (countO >= majority) {
				resultCount++;
			}
		}

		sc.close();

		System.out.println(resultCount);
	}

}
