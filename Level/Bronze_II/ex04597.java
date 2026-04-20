package Bronze_II;

import java.util.Scanner;

public class ex04597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String s = sc.nextLine();

			if (s.equals("#"))
				break;

			int count = 0;

			for (int i = 0; i < s.length() - 1; i++) {
				if (s.charAt(i) == '1')
					count++;
			}

			char last = s.charAt(s.length() - 1);
			String front = s.substring(0, s.length() - 1);

			if (last == 'e') {
				if (count % 2 == 0)
					System.out.println(front + "0");
				else
					System.out.println(front + "1");
			} else {
				if (count % 2 == 0)
					System.out.println(front + "1");
				else
					System.out.println(front + "0");
			}
		}

		sc.close();
	}
}