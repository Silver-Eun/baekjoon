package step8;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 10진법 수 N 입력
		int N = sc.nextInt();
		// 출력할 B진법 입력
		int B = sc.nextInt();

		// 변환된 B진법 수를 저장할 문자열
		String result = "";

		while (N > 0) {
			// N을 B로 나눈 나머지
			int remainder = N % B;
			if (remainder < 10) {
				result = remainder + result;
			} else {
				// 10 이상의 경우 'A'부터 문자로 변환
				result = (char)('A' + remainder - 10) + result;
			}
			N /= B;
		}

		System.out.println(result.toString());

		sc.close();
	}

}
