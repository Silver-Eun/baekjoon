package Bronze_III;

import java.util.Scanner;

public class ex31669 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		String[] arr = new String[N];

		int time = 0;
		boolean found = false;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.next();
		}

		for (int i = 0; i < M; i++) {
			boolean same = true;
			for (int j = 0; j < N; j++) {
				char x = 'X';
				if (arr[j].charAt(i) != x) {
					same = false;
					break;
				}
			}
			if (same) {
				found = true;
				time = i;
				break;
			}
		}

		System.out.println(found ? time + 1 : "ESCAPE FAILED");

		sc.close();
	}

}
