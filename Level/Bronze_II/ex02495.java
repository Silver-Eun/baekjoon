package Bronze_II;

import java.util.Scanner;

public class ex02495 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			String s = sc.next();

			int count = 1;
			int max = 1;

			for (int j = 1; j < 8; j++) {
				if (s.charAt(j) == s.charAt(j - 1)) {
					count++;
					max = Math.max(max, count);
				} else {
					count = 1;
				}
			}
			
			System.out.println(max);
		}

		sc.close();
	}

}
