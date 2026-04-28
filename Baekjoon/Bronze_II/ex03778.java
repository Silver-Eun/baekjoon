package Bronze_II;

import java.util.Scanner;

public class ex03778 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < N; i++) {
			int[] cnt = new int[26];

			int sum = 0;

			String s1 = sc.nextLine();
			String s2 = sc.nextLine();

			for (int j = 0; j < s1.length(); j++) {
				cnt[s1.charAt(j) - 'a']++;
			}
			for (int k = 0; k < s2.length(); k++) {
				cnt[s2.charAt(k) - 'a']--;
			}

			for (int l = 0; l < 26; l++) {
				sum += Math.abs(cnt[l]);
			}

			System.out.println("Case #" + (i + 1) + ": " + sum);
		}

		sc.close();
	}

}
