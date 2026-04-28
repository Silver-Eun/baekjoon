package Bronze_III;

import java.util.Scanner;

public class ex05565 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int a = sc.nextInt();

		for (int i = 0; i < 9; i++) {
			int b = sc.nextInt();

			sum += b;
		}
		
		sc.close();

		System.out.println(a - sum);
	}

}
