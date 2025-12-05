package Bronze_III;

import java.util.Scanner;

public class ex34553 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();

		int cnt = 1;
		int sum = 1;

		for (int i = 0; i < a.length() - 1; i++) {

			if (0 < (a.charAt(i + 1) - a.charAt(i))) {
				cnt++;
			} else {
				cnt = 1;
			}
			sum += cnt;

		}

		System.out.println(sum);

		sc.close();
	}

}
