package Bronze_III;

import java.util.Scanner;

public class ex25024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();


		int[] days = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		for (int i = 0; i < T; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			boolean isTime = false;
			boolean isDate = false;

			if (0 <= x && x <= 23 && 0 <= y && y <= 59) {
				isTime = true;
			}

			if (1 <= x && x <= 12 && 1 <= y && y <= days[x]) {
				isDate = true;
			}

			System.out.println((isTime ? "Yes" : "No") + " " + (isDate ? "Yes" : "No"));
		}
		sc.close();
	}

}
