package Bronze_III;

import java.util.Scanner;

public class ex04458 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < T; i++) {
			String a = sc.nextLine();
			char firstChar = Character.toUpperCase(a.charAt(0));
			String result = firstChar + a.substring(1);

			System.out.println(result);
		}
		
		sc.close();
	}

}
