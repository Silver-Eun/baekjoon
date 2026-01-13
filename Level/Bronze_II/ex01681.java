package Bronze_II;

import java.util.Scanner;

public class ex01681 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int L = sc.nextInt();

		String l = String.valueOf(L);
		int count = 0;
		int i = 1;

		while (true) {
			if (!String.valueOf(i).contains(l)) {
				count++;
				if (count == N) {
					System.out.println(i);
					break;
				}
			}
			i++;
		}

		sc.close();
	}

}
