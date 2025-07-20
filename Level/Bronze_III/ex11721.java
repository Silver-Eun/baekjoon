package Bronze_III;

import java.util.Scanner;

public class ex11721 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();

		for (int i = 0; i < a.length(); i += 10) {
			int end = Math.min(i + 10, a.length());
			System.out.println(a.substring(i, end));
		}

		sc.close();
	}

}
