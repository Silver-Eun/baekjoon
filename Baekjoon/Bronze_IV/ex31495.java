package Bronze_IV;

import java.util.Scanner;

public class ex31495 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.nextLine();

		sc.close();

		if (A.charAt(0) == '"' && A.charAt((A.length() - 1)) == '"' && A.length() <= 2) {
			System.out.println("CE");
		} else if (A.charAt(0) == '"' && A.charAt((A.length() - 1)) == '"') {
			for (int i = 1; i < (A.length() - 1); i++) {
				System.out.print(A.charAt(i));
			}
		} else {
			System.out.println("CE");
		}
	}

}