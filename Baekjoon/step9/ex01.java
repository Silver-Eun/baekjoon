package step9;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			// 첫번째 수
			int a = sc.nextInt();
			// 두번째 수
			int b = sc.nextInt();

			if (a == 0 && b == 0)
				break;

			if (b % a == 0) {
				System.out.println("factor");
			} else if (a % b == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}
		}
		
		sc.close();
	}

}
