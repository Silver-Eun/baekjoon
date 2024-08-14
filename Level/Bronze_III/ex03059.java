package Bronze_III;

import java.util.Scanner;

public class ex03059 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < N; i++) {
			int sum = 0;
			String s = sc.nextLine();
			boolean[] alphabets = new boolean[26];

			for (int j = 0; j < s.length(); j++) {
				int index = s.charAt(j) - 'A';
				alphabets[index] = true;
			}

			for (int j = 0; j < 26; j++) {
				if (!alphabets[j]) {
					sum += (j + 'A');
				}
			}
			System.out.println(sum);
		}
		
		sc.close();
	}

}
