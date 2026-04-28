package Bronze_V;

import java.util.Scanner;

public class ex02475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int a = sc.nextInt();

			sum += a * a;
		}

		sc.close();

		int result = sum % 10;

		System.out.println(result);
	}

}
