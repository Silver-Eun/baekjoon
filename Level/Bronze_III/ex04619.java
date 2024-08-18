package Bronze_III;

import java.util.Scanner;

public class ex04619 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String[] a = sc.nextLine().split(" ");

			int B = Integer.parseInt(a[0]);
			int N = Integer.parseInt(a[1]);

			int num1 = 0;
			int num2 = 0;

			if (B == 0 && N == 0) {
				break;
			}

			int A = 0;

			while (true) {
				if (Math.pow(A, N) <= B) {
					num1 = A;
				} else if (Math.pow(A, N) > B) {
					num2 = A;
					break;
				}
				A++;
			}
			int result = (Math.abs(Math.pow(num1, N) - B) <= Math.abs(Math.pow(num2, N) - B)) ? num1 : num2;

			System.out.println(result);
		}

		sc.close();
	}

}
