package Bronze_II;

import java.util.Scanner;

public class ex05026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < N; i++) {
			String s = sc.nextLine();

			if (s.contains("+")) {
				String[] a = s.split("\\+");

				int A = Integer.parseInt(a[0]);
				int B = Integer.parseInt(a[1]);

				System.out.println(A + B);
			} else if (s.contains("=")) {
				System.out.println("skipped");
			}
		}

		sc.close();
	}

}
