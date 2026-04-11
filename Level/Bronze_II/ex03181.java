package Bronze_II;

import java.util.Scanner;

public class ex03181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] skip = { "i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili" };

		String s = sc.nextLine();

		String[] word = s.split(" ");

		for (int i = 0; i < word.length; i++) {
			boolean isSkip = false;

			for (int j = 0; j < skip.length; j++) {
				if (word[i].equals(skip[j])) {
					isSkip = true;
					break;
				}
			}
			if (i == 0 || !isSkip) {
				System.out.print(Character.toUpperCase(word[i].charAt(0)));
			}
		}

		sc.close();
	}

}
