package Bronze_II;

import java.util.Scanner;

public class ex04436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLong()) {
			long n = sc.nextLong();

			boolean[] visited = new boolean[10];
			int count = 0;

			for (int k = 1;; k++) {
				long value = n * k;

				long temp = value;
				while (temp > 0) {
					int digit = (int) (temp % 10);
					if (!visited[digit]) {
						visited[digit] = true;
						count++;
					}
					temp /= 10;
				}

				if (count == 10) {
					System.out.println(k);
					break;
				}
			}
		}

		sc.close();
	}
}