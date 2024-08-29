package Bronze_III;

import java.util.Scanner;

public class ex06321 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();

			char[] chr = str.toCharArray();

			String chnum = "";

			for (int j = 0; j < chr.length; j++) {
				int chval = (char) ((int) chr[j]) + 1;

				if (chval > 90) {
					chval = 65;
				}
				chnum = chnum + (char) chval;
			}

			System.out.printf("String #%d%n", i + 1);
			System.out.println(chnum);
			System.out.println();
		}
		
		sc.close();
	}

}
