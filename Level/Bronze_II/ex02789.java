package Bronze_II;

import java.util.Scanner;

public class ex02789 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		String a = "CAMBRIDGE";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (a.indexOf(c) == -1)
				System.out.print(c);
			else
				continue;

		}

		sc.close();
	}

}
