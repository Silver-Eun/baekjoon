package Bronze_III;

import java.util.Scanner;

public class ex02935 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.nextLine();
		String operator = sc.nextLine();
		String B = sc.nextLine();

		if (operator.equals("+")) {
			if (A.length() == B.length()) {
				System.out.println("2" + A.substring(1));
			} else {
				int diff = Math.abs(A.length() - B.length());
				if (A.length() > B.length()) {
					System.out.println(A.substring(0, diff) + B);
				} else {
					System.out.println(B.substring(0, diff) + A);
				}
			}
		} else if (operator.equals("*")) {
			System.out.println("1" + "0".repeat(A.length() + B.length() - 2));
		}

		sc.close();
	}

}
