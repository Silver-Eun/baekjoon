package Bronze_III;

import java.util.Scanner;

public class ex32778 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		if (s.contains("(")) {
			int start = s.indexOf("(");
			int end = s.indexOf(")");

			String station = s.substring(0, start).trim();
			String sub = s.substring(start + 1, end).trim();

			System.out.println(station);
			System.out.println(sub);
		} else {
			System.out.println(s.trim());
			System.out.println("-");
		}

		sc.close();
	}

}
