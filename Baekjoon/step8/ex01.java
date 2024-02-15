package step8;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// B진법 수 N 입력
		String N = sc.next();
		// B진법 입력
		int B = sc.nextInt();

		// 10진법으로 변환한 결과
		int decimal = 0;
		// 현재 자리수
		int power = 1;
		for (int i = N.length() - 1; i >= 0; i--) {
			char digit = N.charAt(i);
			// 현재 순회 중인 문자에 해당하는 숫자 값
			int digitValue;
			// digit이 숫자인지 아닌지를 확인하고,
			// 숫자인 경우에는 문자 '0'의 ASCII 값(48)을 빼서 해당 숫자 값을 구하고,
			// 숫자가 아닌 경우에는 'A'의 ASCII 값(65)을 빼고 10을 더하여 해당 숫자 값을 구함
			if (Character.isDigit(digit)) {
				digitValue = digit - '0';
			} else {
				digitValue = digit - 'A' + 10;
			}
			decimal += digitValue * power;
			power *= B;
		}

		System.out.println(decimal);

		sc.close();
	}

}
