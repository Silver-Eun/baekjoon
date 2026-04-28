package Bronze_II;

import java.util.Scanner;

public class ex02386 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String s = sc.nextLine();

			if (s.equals("#"))
				break;

			char a = Character.toLowerCase(s.charAt(0));
			String b = s.substring(2);
			b = b.toLowerCase();

			int cnt = 0;

			for (int i = 0; i < b.length(); i++) {
				if (b.charAt(i) == a)
					cnt++;
			}

			System.out.println(a + " " + cnt);
		}

		sc.close();
	}

}
