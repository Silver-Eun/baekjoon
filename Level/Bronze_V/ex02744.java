package Bronze_V;

import java.util.Scanner;

public class ex02744 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isUpperCase(c)) {
				c = Character.toLowerCase(c);
			} else if (Character.isLowerCase(c)) {
				c = Character.toUpperCase(c);
			}
			System.out.print(c);
		}

		sc.close();
	}

}
