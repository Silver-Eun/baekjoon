package Bronze_III;

import java.util.Scanner;

public class ex31628 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[][] arr = new String[10][10];

		boolean found = false;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				arr[i][j] = sc.next();
			}
		}

		for (int i = 0; i < 10; i++) {
			String first = arr[i][0];
			boolean same = true;
			for (int j = 0; j < 10; j++) {
				if (!arr[i][j].equals(first)) {
					same = false;
					break;
				}
			}
			if (same)
				found = true;
		}
		for (int i = 0; i < 10; i++) {
			String first = arr[0][i];
			boolean same = true;
			for (int j = 0; j < 10; j++) {
				if (!arr[j][i].equals(first)) {
					same = false;
					break;
				}
			}
			if (same)
				found = true;
		}

		System.out.println(found ? 1 : 0);

		sc.close();
	}

}
