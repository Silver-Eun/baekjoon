package Bronze_III;

import java.util.Scanner;

public class ex25641 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		sc.nextLine();

		String A = sc.nextLine();

		for (int i = 0; i < N; i++) {

			String currentString = A.substring(i);

			int s_count = 0;
			int t_count = 0;

			for (int j = 0; j < currentString.length(); j++) {
				if (currentString.charAt(j) == 's') {
					s_count++;
				} else {
					t_count++;
				}
			}

			if (s_count == t_count) {
				System.out.println(currentString);
				break;
			}
		}

		sc.close();
	}

}
