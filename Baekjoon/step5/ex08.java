package step5;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();

		int count = 0;

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == ' ') {
				count++;
			}
		}

		// 첫 번째와 마지막이 공백이 아닌 경우
		if (S.charAt(0) != ' ' && S.charAt(S.length() - 1) != ' ') {
			count = count + 1;
		}

		// 첫 번째와 마지막이 공백인 경우
		if (S.charAt(0) == ' ' && S.charAt(S.length() - 1) == ' ') {
			count = count - 1;
		}

		System.out.println(count);

		sc.close();
	}

}
