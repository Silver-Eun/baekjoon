package Bronze_III;

import java.util.Scanner;

public class ex10569 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int V = sc.nextInt();
			int E = sc.nextInt();

			System.out.println(E - V + 2);
		}
		sc.close();
	}

}
