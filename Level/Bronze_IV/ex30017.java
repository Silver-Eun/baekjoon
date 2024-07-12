package Bronze_IV;

import java.util.Scanner;

public class ex30017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		sc.close();

		int cnt = 0;

		if (A <= B) {
			cnt = 2 * A - 1;
		} else if (A > B)
			cnt = 2 * B + 1;

		System.out.println(cnt);
	}

}
