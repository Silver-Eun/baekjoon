package Bronze_II;

import java.util.Scanner;

public class ex02954 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				System.out.print(s.charAt(i));
				i += 2;
			} else {
				System.out.print(s.charAt(i));
			}
		}

		sc.close();
	}

}
