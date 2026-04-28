package Bronze_II;

import java.util.Scanner;

public class ex01371 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[26];
		int max = 0;

		while (sc.hasNextLine()) {
			String s = sc.nextLine();

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != ' ')
					arr[s.charAt(i) - 'a']++;
			}
		}

		for (int i = 0; i < 26; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		for (int i = 0; i < 26; i++) {
			if (arr[i] == max) {
				System.out.print((char) ('a' + i));
			}
		}

		sc.close();
	}

}
