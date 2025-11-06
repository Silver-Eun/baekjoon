package Bronze_III;

import java.util.Scanner;

public class ex33909 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int S = sc.nextInt();
		int C = sc.nextInt();
		int O = sc.nextInt();
		int N = sc.nextInt();

		int cnt = Math.min((S + N) / 3, (C + 2 * O) / 6);

		System.out.println(cnt);

		sc.close();
	}

}
