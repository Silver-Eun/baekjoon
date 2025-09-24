package Bronze_III;

import java.util.Scanner;

public class ex26264 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		sc.nextLine();

		String s = sc.nextLine();

		int security = 0;
		int bigdata = 0;

		int idx = 0;
		while ((idx = s.indexOf("security", idx)) != -1) {
			security++;
			idx += "security".length();
		}

		idx = 0;
		while ((idx = s.indexOf("bigdata", idx)) != -1) {
			bigdata++;
			idx += "bigdata".length();
		}

		if (security > bigdata) {
			System.out.println("security!");
		} else if (bigdata > security) {
			System.out.println("bigdata?");
		} else {
			System.out.println("bigdata? security!");
		}

		sc.close();
	}

}
