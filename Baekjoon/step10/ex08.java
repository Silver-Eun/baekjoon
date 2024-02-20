package step10;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 세 개의 막대
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		// 가장 큰 변
		int max = 0;

		// 가장 큰 변 찾기
		if (A > B) {
			if (B > C) {
				max = A;
			} else {
				max = (A > C) ? A : C;
			}
		} else {
			max = (B > C) ? B : C;
		}
		
		// 가장 긴 변의 길이가 다른 변의 길이의 합보다 작아야 함
		if (A + B + C - max > max)
			System.out.println(A + B + C);
		else
			System.out.print((A + B + C - max) * 2 - 1);

		sc.close();
	}

}
