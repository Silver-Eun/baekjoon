package Bronze_III;

import java.util.Scanner;

public class ex05692 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String a = sc.nextLine();

			if (a.equals("0"))
				break;

			int size = a.length();
			int sum = 0;

			for (int i = 0; i < a.length(); i++) {
				int n = a.charAt(i) - '0';
				for (int j = 2; j <= size; j++) {
					n *= j;
				}
				sum += n;
				size--;
			}

			System.out.println(sum);

		}
		sc.close();
	}

}
