package Bronze_III;

import java.util.Scanner;

public class ex04740 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String a = sc.nextLine();

			if (a.equals("***")) {
				break;
			}

			String reversed = new StringBuilder(a).reverse().toString();

			System.out.println(reversed);
		}
		
		sc.close();
	}

}
