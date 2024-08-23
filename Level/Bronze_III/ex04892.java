package Bronze_III;

import java.util.Scanner;

public class ex04892 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = 1;

		while (true) {
			int n = sc.nextInt();

			if (n == 0)
				break;

			n = 3 * n;

			if (n % 2 == 0) {
				n = n / 2;
				n = 3 * n;
				n = n / 9;
				System.out.println(cnt + ". even " + n);
			} else {
				n = (n + 1) / 2;
				n = 3 * n;
				n = n / 9;
				System.out.println(cnt + ". odd " + n);
			}

			cnt++;
		}
		
		sc.close();
	}

}
