package Bronze_IV;

import java.util.Scanner;

public class ex05554 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;

		for (int i = 0; i < 4; i++) {
			int a = sc.nextInt();

			sum += a;
		}
		
		sc.close();

		System.out.println(sum / 60);
		System.out.println(sum % 60);
	}

}
