package Bronze_II;

import java.util.Scanner;

public class ex04564 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();

			if (n == 0)
				break;

			while (n >= 10) {
				System.out.print(n + " ");

				int mul = 1;

				while (n > 0) {
					mul *= n % 10;
					n /= 10;
				}

				n = mul;
			}

			System.out.println(n);
		}

		sc.close();
	}
	
}
