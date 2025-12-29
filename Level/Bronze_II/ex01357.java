package Bronze_II;

import java.util.Scanner;

public class ex01357 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String[] sp = input.split(" ");

		int A = reverseToInt(sp[0]);
		int B = reverseToInt(sp[1]);

		int result = reverseToInt(String.valueOf(A + B));

		System.out.println(result);

		sc.close();
	}

	static int reverseToInt(String s) {
		int num = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			num = num * 10 + (s.charAt(i) - '0');
		}
		return num;
	}

}
