package step7;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[][] arr = new char[5][15];

		String input = "";

		for (int i = 0; i < 5; i++) {
			input = sc.next();
			for (int j = 0; j < input.length(); j++) {
				arr[i][j] = input.charAt(j);
			}
		}

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[j][i] == '\0')
					continue;
				System.out.print(arr[j][i]);
			}
		}

		sc.close();
	}

}
