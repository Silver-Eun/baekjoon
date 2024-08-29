package Bronze_III;

import java.util.Scanner;

public class ex06378 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String str = sc.nextLine();

			if (str.equals("0"))
				break;
			while (true) {
				int sum = 0;

				if (str.length() < 2) {
					break;
				} else {
					for (int i = 0; i < str.length(); i++) {
						sum += str.charAt(i) - '0';
					}
				}

				str = String.valueOf(sum);
			}
			System.out.println(str);

		}

		sc.close();
	}

}
