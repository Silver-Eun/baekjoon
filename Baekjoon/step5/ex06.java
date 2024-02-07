package step5;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		int[] arr = new int[26];

		for (int i = 0; i < 26; i++) {
			arr[i] = -1;
		}

		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);

			if (arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}

		for (int val : arr) {
			System.out.print(val + " ");
		}

		sc.close();
	}

}
