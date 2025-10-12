package Bronze_III;

import java.util.Scanner;

public class ex30958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();

		int[] count = new int[26];

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				count[ch - 'a']++;
			}
		}

		int max = 0;
		for (int c : count) {
			if (c > max)
				max = c;
		}

		System.out.println(max);

		sc.close();
	}

}
