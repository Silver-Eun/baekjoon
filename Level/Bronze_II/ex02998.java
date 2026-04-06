package Bronze_II;

import java.util.Scanner;

public class ex02998 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int mod = s.length() % 3;

		if (mod != 0) {
			for (int i = 0; i < 3 - mod; i++) {
				s = "0" + s;
			}
		}

		for (int i = 0; i < s.length(); i += 3) {
			int value = (s.charAt(i) - '0') * 4 + (s.charAt(i + 1) - '0') * 2 + (s.charAt(i + 2) - '0');
			System.out.print(value);
		}


		sc.close();
	}

}
